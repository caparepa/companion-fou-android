package com.caparepa.companionfou.ui.viewmodel.nice

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.MaterialEntity
import com.caparepa.companionfou.data.model.nice.material.MaterialItem
import com.caparepa.companionfou.repository.nice.MaterialRepository
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel
import com.caparepa.companionfou.utils.OGS_MATERIAL
import com.caparepa.companionfou.utils.delegates.PreferenceDelegate.Companion.currentDate
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class MaterialViewModel(val context: Context, private val materialRepository: MaterialRepository) :
    BaseViewModel(), KoinComponent {

    val materialListResponse = MutableLiveData<List<MaterialItem>>()
    val materialListResult = MutableLiveData<List<MaterialEntity>>()
    val materialItemResult = MutableLiveData<MaterialEntity>()

    fun getMaterials(server: String) {
        viewModelScope.launch(Dispatchers.IO) {
            getMaterialsAsync(server)
        }
    }

    fun fetchMaterials(server: String) {
        viewModelScope.launch(Dispatchers.IO) {
            fetchMaterialListAsync(server)
        }
    }

    fun fetchMaterialById(id: Long, server: String) {
        viewModelScope.launch(Dispatchers.IO) {
            fetchMaterialByIdAsync(id, server)
        }
    }

    private suspend fun getMaterialsAsync(server: String) {
        val result = kotlin.runCatching {
            materialRepository.getMaterialList(currentDate, server)
        }
        with(result) {
            onSuccess {
                it?.let {
                    onGetSuccess.postValue(OGS_MATERIAL)
                }
            }
            onFailure {
                onGetError.postValue(OGS_MATERIAL)
                onError.postValue(it.message)
            }
        }
    }

    private suspend fun fetchMaterialListAsync(server: String) {
        val result = kotlin.runCatching {
            materialRepository.fetchMaterialList(server)
        }
        with(result) {
            onSuccess {
                it?.let {
                    materialListResult.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    private suspend fun fetchMaterialByIdAsync(id: Long, server: String) {
        val result = kotlin.runCatching {
            materialRepository.fetchMaterial(id, server)
        }
        with(result) {
            onSuccess {
                it?.let {
                    materialItemResult.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

}