package com.caparepa.companionfou.ui.viewmodel

import android.content.Context
import com.caparepa.companionfou.repository.BasicDataRepository
import org.koin.core.KoinComponent

class BasicDataViewModel(val context: Context, val basicDataRepository: BasicDataRepository) :
    BaseViewModel(), KoinComponent {
}