package com.caparepa.companionfou.ui.viewmodel.nice

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.CommandCodeEntity
import com.caparepa.companionfou.repository.nice.CommandCodeRepository
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class CommandCodeViewModel(val context: Context, val commandcodeRepository: CommandCodeRepository) :
    BaseViewModel(), KoinComponent {

    val commandCodeListResult = MutableLiveData<List<CommandCodeEntity>>()
    val commandCodeItemResult = MutableLiveData<CommandCodeEntity>()

    fun getCommandCodes(server: String)  {
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

        }
    }

    private suspend fun getCommandCodesAsync(server: String) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchCommandCodesAsync(server: String) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    private suspend fun fetchCommandCodeByIdAsync(id: Long, server: String) {
        val result = kotlin.runCatching {

        }
        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }
}