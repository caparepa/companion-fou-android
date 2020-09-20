package com.caparepa.companionfou.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler

open class BaseViewModel : ViewModel() {
    val loadingState = MutableLiveData<Boolean>()
    val onFetchSuccess = MutableLiveData<Any>()
    val onGetSuccess = MutableLiveData<Any>()
    val onPersistSuccess = MutableLiveData<Any>()
    val onSuccess = MutableLiveData<Any>()
    val onError = MutableLiveData<String>()

    private val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        throwable.printStackTrace()
    }

    protected fun showLoading() = loadingState.postValue(true)

    protected fun dismissLoading() = loadingState.postValue(false)
}