package com.caparepa.companionfou.ui.viewmodel.nice

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.data.model.nice.servant.ServantItem
import com.caparepa.companionfou.repository.nice.ServantRepository
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel
import com.caparepa.companionfou.utils.OGS_SERVANT
import com.caparepa.companionfou.utils.delegates.PreferenceDelegate.Companion.currentDate
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class ServantViewModel(val context: Context, private val servantRepository: ServantRepository) :
    BaseViewModel(), KoinComponent {

    val servantListResponse = MutableLiveData<List<ServantItem>>()
    val servantListResult = MutableLiveData<List<ServantEntity>>()
    val servantItemResult = MutableLiveData<ServantEntity>()

    fun getServants(server: String) {
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
            fetchServantByIdAsync(id, server)
        }
    }

    private suspend fun getServantsAsync(server: String) {
        val result = kotlin.runCatching {
            servantRepository.getServantList(currentDate, server)
        }
        with(result) {
            onSuccess {
                it?.let {
                    onGetSuccess.postValue(OGS_SERVANT)
                }
            }
            onFailure {
                onGetError.postValue(OGS_SERVANT)
                onError.postValue(it.message)
            }
        }
    }

    private suspend fun fetchServantsAsync(server: String) {
        val result = kotlin.runCatching {
            servantRepository.fetchServantList(server)
        }
        with(result) {
            onSuccess {
                it?.let {
                    servantListResult.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    private suspend fun fetchServantByIdAsync(id: Long, server: String) {
        val result = kotlin.runCatching {
            servantRepository.fetchServant(id, server)
        }
        with(result) {
            onSuccess {
                it?.let {
                    servantItemResult.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }
}