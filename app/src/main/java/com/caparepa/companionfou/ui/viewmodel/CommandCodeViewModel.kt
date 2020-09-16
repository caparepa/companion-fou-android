package com.caparepa.companionfou.ui.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.CommandCodeEntity
import com.caparepa.companionfou.repository.nice.CommandCodeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class CommandCodeViewModel(val context: Context, val commandcodeRepository: CommandCodeRepository) :
    BaseViewModel(), KoinComponent {
    val commandCodeListResult = MutableLiveData<List<CommandCodeEntity>>()
    val commandCodeItemResult = MutableLiveData<CommandCodeEntity>()

    fun getCommandCodes()  {
        viewModelScope.launch(Dispatchers.IO) {
            getCommandCodesAsync()
        }
    }

    fun fetchCommandCodes() {
        viewModelScope.launch(Dispatchers.IO) {
            fetchCommandCodesAsync()
        }
    }

    fun fetchCommandCodeById(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }

    private suspend fun getCommandCodesAsync() {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchCommandCodesAsync() {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchCommandCodeByIdAsync(id: Long) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }
}