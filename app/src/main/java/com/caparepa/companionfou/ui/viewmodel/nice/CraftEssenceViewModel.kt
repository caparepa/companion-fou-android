package com.caparepa.companionfou.ui.viewmodel.nice

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.CraftEssenceEntity
import com.caparepa.companionfou.data.model.nice.craftessence.CraftEssenceItem
import com.caparepa.companionfou.repository.nice.CraftEssenceRepository
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel
import com.caparepa.companionfou.utils.CURRENT_DATE
import com.caparepa.companionfou.utils.OGS_CRAFT_ESSENCE
import com.caparepa.companionfou.utils.delegates.PreferenceDelegate.Companion.currentDate
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class CraftEssenceViewModel(
    val context: Context,
    private val craftEssenceRepository: CraftEssenceRepository
) : BaseViewModel(), KoinComponent {

    val craftEssenceListResult = MutableLiveData<List<CraftEssenceEntity>>()
    val craftEssenceItemResult = MutableLiveData<CraftEssenceEntity>()

    fun getCraftEssences(server: String)  {
        viewModelScope.launch(Dispatchers.IO) {
            getCraftEssencesAsync(server)
        }
    }

    fun fetchCraftEssences(server: String) {
        viewModelScope.launch(Dispatchers.IO) {
            fetchCraftEssencesAsync(server)
        }
    }

    fun fetchCraftEssenceById(id: Long, server: String) {
        viewModelScope.launch(Dispatchers.IO) {
            fetchCraftEssenceByIdAsync(id, server)
        }
    }

    private suspend fun getCraftEssencesAsync(server: String) {
        val result = kotlin.runCatching {
            craftEssenceRepository.getCraftEssenceList(currentDate, server)
        }
        with(result){
            onSuccess {
                it?.let {
                    onGetSuccess.postValue(OGS_CRAFT_ESSENCE)
                }
            }
            onFailure {
                onGetError.postValue(OGS_CRAFT_ESSENCE)
                onError.postValue(it.message)
            }
        }
    }

    private suspend fun fetchCraftEssencesAsync(server: String) {
        val result = kotlin.runCatching {
            craftEssenceRepository.fetchCraftEssenceList(server)
        }
        with(result){
            onSuccess {
                it?.let {
                    craftEssenceListResult.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    private suspend fun fetchCraftEssenceByIdAsync(id: Long, server: String) {
        val result = kotlin.runCatching {
            craftEssenceRepository.fetchCraftEssence(id, server)
        }
        with(result){
            onSuccess {
                it?.let {
                    craftEssenceItemResult.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }
}