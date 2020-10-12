package com.caparepa.companionfou.ui.viewmodel.nice

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.MaterialEntity
import com.caparepa.companionfou.repository.nice.MaterialRepository
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class MaterialViewModel(val context: Context, val materialRepository: MaterialRepository) :
    BaseViewModel(), KoinComponent {

    val materialListResult = MutableLiveData<List<MaterialEntity>>()
    val materialItemResult = MutableLiveData<MaterialEntity>()

    fun getMaterials(server: String)  {
        viewModelScope.launch(Dispatchers.IO) {
            getMaterialsAsync(server)
        }
    }

    fun fetchMaterials(server: String) {
        viewModelScope.launch(Dispatchers.IO) {
            fetchMaterialsAsync(server)
        }
    }

    fun fetchMaterialById(id: Long, server: String) {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }

    private suspend fun getMaterialsAsync(server: String) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchMaterialsAsync(server: String) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchMaterialByIdAsync(id: Long, server: String) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

}