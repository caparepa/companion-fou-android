package com.caparepa.companionfou.di.modules

import com.caparepa.companionfou.network.api.AtlasApiClient
import com.caparepa.companionfou.network.interceptor.ConnectivityInterceptor
import com.caparepa.companionfou.network.interceptor.ConnectivityInterceptorImpl
import org.koin.dsl.module

val networkModule = module {
    single { AtlasApiClient.invoke() }
    single<ConnectivityInterceptor> { ConnectivityInterceptorImpl(get()) }
}

val repositoryModule = module {

}

val localModule = module {
    //Shared preferences here!
}

val databaseModule = module {

}
