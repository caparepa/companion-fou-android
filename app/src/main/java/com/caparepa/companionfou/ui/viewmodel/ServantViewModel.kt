package com.caparepa.companionfou.ui.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.repository.nice.ServantRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class ServantViewModel(val context: Context, val servantRepository: ServantRepository) :
    BaseViewModel(), KoinComponent {

    val servantListResult = MutableLiveData<List<ServantEntity>>()
    val servantItemResult = MutableLiveData<ServantEntity>()

    fun getServants()  {
        viewModelScope.launch(Dispatchers.IO) {
            getServantsAsync()
        }
    }

    fun fetchServants() {
        viewModelScope.launch(Dispatchers.IO) {
            fetchServantsAsync()
        }
    }

    fun fetchServantById(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }

    private suspend fun getServantsAsync() {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchServantsAsync() {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchServantByIdAsync(id: Long) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }
}