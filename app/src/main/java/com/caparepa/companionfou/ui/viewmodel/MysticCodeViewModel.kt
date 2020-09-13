package com.caparepa.companionfou.ui.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.dao.nice.MysticCodeDao
import com.caparepa.companionfou.data.db.entity.nice.MysticCode
import com.caparepa.companionfou.data.model.nice.mysticcode.MysticCodeItem
import com.caparepa.companionfou.repository.nice.MysticCodeRepository
import com.caparepa.companionfou.utils.REGION_NA
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class MysticCodeViewModel(
    val context: Context,
    val mysticCodeRepository: MysticCodeRepository,
    val mysticCodeDao: MysticCodeDao
) :
    BaseViewModel(), KoinComponent {

    val mysticCodeListResponse = MutableLiveData<List<MysticCode>>()
    val mysticCodeListResult = MutableLiveData<List<MysticCode>>()
    val mysticCodeResult = MutableLiveData<MysticCode>()

    fun getMysticCodes() {
        viewModelScope.launch(Dispatchers.IO) {
            getMysticCodesAsync()
        }
    }

    fun fetchMysticCodes() {
        viewModelScope.launch(Dispatchers.IO) {
            fetchMysticCodesAsync()
        }
    }

    fun fetchMysticCode(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            fetchMysticCodeAsync(id)
        }
    }

    private suspend fun getMysticCodesAsync() {
        val result = kotlin.runCatching {
            mysticCodeRepository.getMysticCodes("20200905", REGION_NA)
        }
        with(result) {
            onSuccess {
                it?.let {
                    mysticCodeListResponse.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    private suspend fun fetchMysticCodesAsync() {
        val result = kotlin.runCatching {

        }
        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    private suspend fun fetchMysticCodeAsync(id: Long) {
        val result = kotlin.runCatching {

        }
        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

}