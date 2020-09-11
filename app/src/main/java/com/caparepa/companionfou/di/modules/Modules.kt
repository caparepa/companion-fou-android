package com.caparepa.companionfou.di.modules

import com.caparepa.companionfou.data.db.CompanionFouDatabase
import com.caparepa.companionfou.data.db.dao.basic.*
import com.caparepa.companionfou.data.db.dao.nice.servant.ServantDao
import com.caparepa.companionfou.network.api.ApiClient
import com.caparepa.companionfou.network.interceptor.ConnectivityInterceptor
import com.caparepa.companionfou.network.interceptor.ConnectivityInterceptorImpl
import com.caparepa.companionfou.repository.basic.BasicDataRepository
import com.caparepa.companionfou.repository.basic.BasicDataRepositoryImpl
import com.caparepa.companionfou.ui.viewmodel.BasicDataViewModel
import com.caparepa.companionfou.ui.viewmodel.ServantDataViewModel
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
    //Database binding
    single { CompanionFouDatabase.invoke(androidContext()) }

    //Accessor binding
    fun provideBasicServantDao(database: CompanionFouDatabase): BasicServantDao {
        return database.basicServantDao()
    }

    fun provideBasicCommandCodeDao(database: CompanionFouDatabase): BasicCommandCodeDao {
        return database.basicCommandCodeDao()
    }

    fun provideBasicCraftEssenceDao(database: CompanionFouDatabase): BasicCraftEssenceDao {
        return database.basicCraftEssenceDao()
    }

    fun provideBasicMysticCodeDao(database: CompanionFouDatabase): BasicMysticCodeDao {
        return database.basicMysticCodeDao()
    }

    fun provideBasicMysticCodeMediaDao(database: CompanionFouDatabase): BasicMysticCodeMediaDao {
        return database.basicMysticCodeMediaDao()
    }

    fun provideServantDao(database: CompanionFouDatabase): ServantDao {
        return database.servantDao()
    }

    //DAO binding
    single { provideBasicServantDao(get()) }
    single { provideBasicCommandCodeDao(get()) }
    single { provideBasicCraftEssenceDao(get()) }
    single { provideBasicMysticCodeDao(get()) }
    single { provideBasicMysticCodeMediaDao(get()) }
    single { provideServantDao(get()) }

}

val viewModelModule = module {
    viewModel { BasicDataViewModel(androidContext(), get()) }
    viewModel { ServantDataViewModel(androidContext(), get()) }
}
