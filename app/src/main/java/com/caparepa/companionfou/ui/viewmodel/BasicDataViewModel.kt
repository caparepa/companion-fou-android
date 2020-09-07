package com.caparepa.companionfou.ui.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.model.basic.ServantItem
import com.caparepa.companionfou.repository.BasicDataRepository
import com.caparepa.companionfou.utils.REGION_NA
import com.caparepa.companionfou.utils.URL_EXPORT_DIR
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class BasicDataViewModel(val context: Context, val basicDataRepository: BasicDataRepository) :
    BaseViewModel(), KoinComponent {

    val basicServantResponse = MutableLiveData<List<ServantItem>?>()

    fun getBasicServantList() {
        viewModelScope.launch(Dispatchers.IO) {
            getBasicServantListAsync()
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