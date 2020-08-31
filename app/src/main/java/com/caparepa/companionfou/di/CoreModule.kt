package com.caparepa.companionfou.di

import com.caparepa.companionfou.di.modules.databaseModule
import com.caparepa.companionfou.di.modules.localModule
import com.caparepa.companionfou.di.modules.networkModule
import com.caparepa.companionfou.di.modules.repositoryModule
import org.koin.core.context.loadKoinModules

object CoreModule {
    private val modules = listOf(networkModule, repositoryModule, localModule, databaseModule)
    fun init() = loadKoinModules(modules)
}