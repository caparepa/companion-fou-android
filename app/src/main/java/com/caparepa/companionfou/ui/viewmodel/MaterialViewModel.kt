package com.caparepa.companionfou.ui.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.MaterialEntity
import com.caparepa.companionfou.repository.nice.MaterialRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class MaterialViewModel(val context: Context, val materialRepository: MaterialRepository) :
    BaseViewModel(), KoinComponent {

    val materialListResult = MutableLiveData<List<MaterialEntity>>()
    val materialItemResult = MutableLiveData<MaterialEntity>()

    fun getMaterials()  {
        viewModelScope.launch(Dispatchers.IO) {
            getMaterialsAsync()
        }
    }

    fun fetchMaterials() {
        viewModelScope.launch(Dispatchers.IO) {
            fetchMaterialsAsync()
        }
    }

    fun fetchMaterialById(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }

    private suspend fun getMaterialsAsync() {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchMaterialsAsync() {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchMaterialByIdAsync(id: Long) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

}