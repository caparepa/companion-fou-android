package com.caparepa.companionfou.ui.viewmodel.download

import androidx.lifecycle.MutableLiveData
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel

class DownloadViewModel: BaseViewModel() {

    val generalDataNaDownloadCount = MutableLiveData<Int>()
    val gameDataNaDownloadCount = MutableLiveData<Int>()
    val retryGeneralDataNaDownload = MutableLiveData<Boolean>()
    val retryGameDataNaDownload = MutableLiveData<Boolean>()

    val generalDataJpDownloadCount = MutableLiveData<Int>()
    val gameDataJpDownloadCount = MutableLiveData<Int>()
    val retryGeneralDataJpDownload = MutableLiveData<Boolean>()
    val retryGameDataJpDownload = MutableLiveData<Boolean>()

}