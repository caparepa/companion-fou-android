package com.caparepa.companionfou.ui.viewmodel.nice

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.CommandCodeEntity
import com.caparepa.companionfou.data.model.nice.commandcode.CommandCodeItem
import com.caparepa.companionfou.repository.nice.CommandCodeRepository
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel
import com.caparepa.companionfou.utils.OGS_COMMAND_CODE
import com.caparepa.companionfou.utils.delegates.PreferenceDelegate.Companion.currentDate
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class CommandCodeViewModel(
    val context: Context,
    private val commandCodeRepository: CommandCodeRepository
) :
    BaseViewModel(), KoinComponent {

    val commandCodeListResponseOk = MutableLiveData<Boolean>()
    val commandCodeListResult = MutableLiveData<List<CommandCodeEntity>>()
    val commandCodeItemResult = MutableLiveData<CommandCodeEntity>()

    fun getCommandCodes(server: String) {
        viewModelScope.launch(Dispatchers.IO) {
            getCommandCodesAsync(server)
        }
    }

    fun fetchCommandCodes(server: String) {
        viewModelScope.launch(Dispatchers.IO) {
            fetchCommandCodesAsync(server)
        }
    }

    fun fetchCommandCodeById(id: Long, server: String) {
        viewModelScope.launch(Dispatchers.IO) {
            fetchCommandCodeByIdAsync(id, server)
        }
    }

    private suspend fun getCommandCodesAsync(server: String) {
        val result = kotlin.runCatching {
            commandCodeRepository.getCommandCodeList(currentDate, server)
        }
        with(result) {
            onSuccess {
                it?.let {
                    commandCodeListResponseOk.postValue(true)
                }
            }
            onFailure {
                onError.postValue(it.message)
                commandCodeListResponseOk.postValue(true)
            }
        }
    }

    private suspend fun fetchCommandCodesAsync(server: String) {
        val result = kotlin.runCatching {
            commandCodeRepository.fetchCommandCodeList(server)
        }
        with(result) {
            onSuccess {
                it?.let {
                    commandCodeListResult.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    private suspend fun fetchCommandCodeByIdAsync(id: Long, server: String) {
        val result = kotlin.runCatching {
            commandCodeRepository.fetchCommandCode(id, server)
        }
        with(result) {
            onSuccess {
                it?.let {
                    commandCodeItemResult.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }
}