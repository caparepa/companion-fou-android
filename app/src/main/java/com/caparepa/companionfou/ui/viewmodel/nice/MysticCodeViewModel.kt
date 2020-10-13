package com.caparepa.companionfou.ui.viewmodel.nice

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.MysticCodeEntity
import com.caparepa.companionfou.repository.nice.MysticCodeRepository
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel
import com.caparepa.companionfou.utils.OGS_MYSTIC_CODE
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class MysticCodeViewModel(
    val context: Context,
    private val mysticCodeRepository: MysticCodeRepository
) :
    BaseViewModel(), KoinComponent {

    val mysticCodeListResponseOk = MutableLiveData<Boolean>()
    val mysticCodeListResult = MutableLiveData<List<MysticCodeEntity>>()
    val mysticCodeResult = MutableLiveData<MysticCodeEntity>()

    fun getMysticCodes(server: String) {
        viewModelScope.launch(Dispatchers.IO) {
            getMysticCodesAsync(server)
        }
    }

    fun fetchMysticCodes(server: String) {
        viewModelScope.launch(Dispatchers.IO) {
            fetchMysticCodesAsync(server)
        }
    }

    fun fetchMysticCode(id: Long, server: String) {
        viewModelScope.launch(Dispatchers.IO) {
            fetchMysticCodeAsync(id, server)
        }
    }

    private suspend fun getMysticCodesAsync(server: String) {
        val result = kotlin.runCatching {
            mysticCodeRepository.getMysticCodeList("20200905", server)
        }
        with(result) {
            onSuccess {
                it?.let {
                    mysticCodeListResponseOk.postValue(true)
                }
            }
            onFailure {
                onError.postValue(it.message)
                mysticCodeListResponseOk.postValue(false)
            }
        }
    }

    private suspend fun fetchMysticCodesAsync(server: String) {
        val result = kotlin.runCatching {
            mysticCodeRepository.fetchMysticCodeList(server)
        }
        with(result) {
            onSuccess {
                it?.let {
                    mysticCodeListResult.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    private suspend fun fetchMysticCodeAsync(id: Long ,server: String) {
        val result = kotlin.runCatching {
            mysticCodeRepository.fetchMysticCode(id, server)
        }
        with(result) {
            onSuccess {
                it?.let {
                    mysticCodeResult.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

}