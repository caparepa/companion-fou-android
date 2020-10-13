package com.caparepa.companionfou.ui.viewmodel.download

import androidx.lifecycle.MutableLiveData
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel

class DownloadViewModel : BaseViewModel() {
    val finishAndClose = MutableLiveData<Boolean>()
    val finishAndNavigate = MutableLiveData<Boolean>()
    val dataDownloadOkPool = MutableLiveData<ArrayList<String>>()
    val dataDownloadErrorPool = MutableLiveData<ArrayList<String>>()
}