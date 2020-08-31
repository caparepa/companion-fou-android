package com.caparepa.companionfou

import android.app.Application
import com.caparepa.companionfou.di.CoreModule
import com.jakewharton.threetenabp.AndroidThreeTen

class CompanionFouApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        //CoreModule.init()
        //AndroidThreeTen.init(this)
    }

}