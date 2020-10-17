package com.caparepa.companionfou.ui.viewmodel.basic

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.model.basic.BasicServantItem
import com.caparepa.companionfou.repository.basic.BasicDataRepository
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel
import com.caparepa.companionfou.utils.REGION_NA
import com.caparepa.companionfou.utils.delegates.PreferenceDelegate.Companion.currentDate
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class BasicDataViewModel(val context: Context, val basicDataRepository: BasicDataRepository) :
    BaseViewModel(), KoinComponent {

    val basicServantResponse = MutableLiveData<List<BasicServantItem>?>()

    fun getBasicServantList() {
        viewModelScope.launch(Dispatchers.IO) {
            getBasicServantListAsync()
        }
    }

    private suspend fun getBasicServantListAsync() {
        val result = kotlin.runCatching {
            basicDataRepository.getBasicServants(currentDate, REGION_NA)
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