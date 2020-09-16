package com.caparepa.companionfou.ui.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.caparepa.companionfou.data.db.entity.nice.MaterialEntity
import com.caparepa.companionfou.repository.nice.MaterialRepository
import org.koin.core.KoinComponent

class MaterialViewModel(val context: Context, val materialRepository: MaterialRepository) :
    BaseViewModel(), KoinComponent {

    val materialListResult = MutableLiveData<List<MaterialEntity>>()
    val materialItemResult = MutableLiveData<MaterialEntity>()

    fun getMaterials()  {

    }

    fun fetchMaterials() {

    }

    fun fetchMaterialById(id: Long) {

    }

    private suspend fun getMaterialsAsync() {

    }

    private suspend fun fetchMaterialsAsync() {

    }

    private suspend fun fetchMaterialByIdAsync(id: Long) {

    }

}