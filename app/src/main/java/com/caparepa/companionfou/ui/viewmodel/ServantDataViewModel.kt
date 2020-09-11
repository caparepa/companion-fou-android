package com.caparepa.companionfou.ui.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.servant.NiceServantItem
import com.caparepa.companionfou.repository.nice.servant.ServantRepository
import com.caparepa.companionfou.utils.REGION_NA
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class ServantDataViewModel(
    val context: Context,
    private val servantRepository: ServantRepository
): BaseViewModel(), KoinComponent {

    val servantResponse = MutableLiveData<List<NiceServantItem>?>()

    fun getServantList() {
        viewModelScope.launch(Dispatchers.IO) {
            getServantListAsync()
        }
    }

    fun fetchServantList() {
        viewModelScope.launch(Dispatchers.IO) {
            fetchServantListAsync()
        }
    }

    private suspend fun getServantListAsync() {
        val result = kotlin.runCatching {
            servantRepository.getServants("20200905", REGION_NA)
        }

        with(result) {
            onSuccess {
                it?.let {
                    servantResponse.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    private suspend fun fetchServantListAsync() {
        val result = kotlin.runCatching {
            servantRepository.fetchServants()
        }
        with(result) {
            onSuccess {
                it?.let {
                    servantResponse.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

}