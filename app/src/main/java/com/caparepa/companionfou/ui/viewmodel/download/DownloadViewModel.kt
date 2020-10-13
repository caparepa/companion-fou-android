package com.caparepa.companionfou.ui.viewmodel.download

import androidx.lifecycle.MutableLiveData
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel

class DownloadViewModel : BaseViewModel() {
    val finishAndClose = MutableLiveData<Boolean>()
    val finishAndNavigate = MutableLiveData<Boolean>()
    val gameDataDownloadCount = MutableLiveData<Int>()
    val generalDataDownloadCount = MutableLiveData<Int>()
    val downloadPool = MutableLiveData<ArrayList<Int>>()
}