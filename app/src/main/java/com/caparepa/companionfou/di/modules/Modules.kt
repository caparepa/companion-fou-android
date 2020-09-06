package com.caparepa.companionfou.di.modules

import com.caparepa.companionfou.network.api.ApiClient
import com.caparepa.companionfou.network.interceptor.ConnectivityInterceptor
import com.caparepa.companionfou.network.interceptor.ConnectivityInterceptorImpl
import com.caparepa.companionfou.repository.BasicDataRepository
import com.caparepa.companionfou.repository.BasicDataRepositoryImpl
import com.caparepa.companionfou.ui.viewmodel.BasicDataViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val networkModule = module {
    single { ApiClient.invoke() }
    single<ConnectivityInterceptor> { ConnectivityInterceptorImpl(get()) }
}

val repositoryModule = module {
    factory<BasicDataRepository> { BasicDataRepositoryImpl() }
}

val localModule = module {
    //Shared preferences here!
}

val databaseModule = module {

}

val viewModelModule = module {
    viewModel { BasicDataViewModel(androidContext(), get()) }
}
