package com.caparepa.companionfou.ui.viewmodel.nice

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.CraftEssenceEntity
import com.caparepa.companionfou.repository.nice.CraftEssenceRepository
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class CraftEssenceViewModel(
    val context: Context,
    val craftEssenceRepository: CraftEssenceRepository
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

        }
    }

    private suspend fun getCraftEssencesAsync(server: String) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchCraftEssencesAsync(server: String) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchCraftEssenceByIdAsync(id: Long, server: String) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }
}