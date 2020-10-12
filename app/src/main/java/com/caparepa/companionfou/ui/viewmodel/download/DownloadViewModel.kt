package com.caparepa.companionfou.ui.viewmodel.download

import androidx.lifecycle.MutableLiveData
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel

class DownloadViewModel: BaseViewModel() {

    val finishAndClose = MutableLiveData<Boolean>()
    val finishAndNavigate = MutableLiveData<Boolean>()

    val gameDataNaDownloadCount = MutableLiveData<Int>()
    val generalDataNaDownloadCount = MutableLiveData<Int>()
    val retryGameDataNaDownload = MutableLiveData<Boolean>()
    val retryGeneralDataNaDownload = MutableLiveData<Boolean>()

    val gameDataJpDownloadCount = MutableLiveData<Int>()
    val generalDataJpDownloadCount = MutableLiveData<Int>()
    val retryGameDataJpDownload = MutableLiveData<Boolean>()
    val retryGeneralDataJpDownload = MutableLiveData<Boolean>()

}