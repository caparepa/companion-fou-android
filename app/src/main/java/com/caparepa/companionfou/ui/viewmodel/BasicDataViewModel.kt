package com.caparepa.companionfou.ui.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.basic.ServantItem
import com.caparepa.companionfou.repository.BasicDataRepository
import com.caparepa.companionfou.utils.REGION_NA
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class BasicDataViewModel(val context: Context, private val basicDataRepository: BasicDataRepository) :
    BaseViewModel(), KoinComponent {

    val basicServantResponse = MutableLiveData<List<ServantItem>?>()
    val basicServantList = MutableLiveData<List<ServantItem>?>()

    fun getBasicServantList() {
        viewModelScope.launch(Dispatchers.IO) {
            getBasicServantListAsync()
        }
    }

    fun fetchBasicServantList() {
        viewModelScope.launch(Dispatchers.IO) {
            fetchBasicServantListAsync()
        }
    }

    private suspend fun fetchBasicServantListAsync() {
        val result = kotlin.runCatching {
            basicDataRepository.fetchBasicServants()
        }
        with(result) {
            onSuccess {
                it?.let {
                    basicServantList.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    private suspend fun getBasicServantListAsync() {
        val result = kotlin.runCatching {
            basicDataRepository.getBasicServants("20200905", REGION_NA)
        }

        with(result) {
            onSuccess {
                it?.let {
                    basicServantResponse.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

}