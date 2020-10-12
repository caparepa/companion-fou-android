package com.caparepa.companionfou.ui.viewmodel.nice

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.repository.nice.ServantRepository
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class ServantViewModel(val context: Context, val servantRepository: ServantRepository) :
    BaseViewModel(), KoinComponent {

    val servantListResult = MutableLiveData<List<ServantEntity>>()
    val servantItemResult = MutableLiveData<ServantEntity>()

    fun getServants(server: String)  {
        viewModelScope.launch(Dispatchers.IO) {
            getServantsAsync(server)
        }
    }

    fun fetchServants(server: String) {
        viewModelScope.launch(Dispatchers.IO) {
            fetchServantsAsync(server)
        }
    }

    fun fetchServantById(id: Long, server: String) {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }

    private suspend fun getServantsAsync(server: String) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchServantsAsync(server: String) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchServantByIdAsync(id: Long, server: String) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }
}