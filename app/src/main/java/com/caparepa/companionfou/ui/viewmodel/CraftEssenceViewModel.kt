package com.caparepa.companionfou.ui.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.CraftEssenceEntity
import com.caparepa.companionfou.repository.nice.CraftEssenceRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class CraftEssenceViewModel(
    val context: Context,
    val craftEssenceRepository: CraftEssenceRepository
) : BaseViewModel(), KoinComponent {

    val craftEssenceListResult = MutableLiveData<List<CraftEssenceEntity>>()
    val craftEssenceItemResult = MutableLiveData<CraftEssenceEntity>()

    fun getCraftEssences()  {
        viewModelScope.launch(Dispatchers.IO) {
            getCraftEssencesAsync()
        }
    }

    fun fetchCraftEssences() {
        viewModelScope.launch(Dispatchers.IO) {
            fetchCraftEssencesAsync()
        }
    }

    fun fetchCraftEssenceById(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }

    private suspend fun getCraftEssencesAsync() {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchCraftEssencesAsync() {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchCraftEssenceByIdAsync(id: Long) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }
}