package com.caparepa.companionfou

import android.app.Application
import com.caparepa.companionfou.di.CoreModule
import com.jakewharton.threetenabp.AndroidThreeTen
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class CompanionFouApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        //initKoin()
        //CoreModule.init()
        //AndroidThreeTen.init(this)
    }

    private fun initKoin() {
        startKoin {
            androidLogger()
            androidContext(this@CompanionFouApplication)
        }
    }

}