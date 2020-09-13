package com.caparepa.companionfou.di.modules

import com.caparepa.companionfou.data.db.CompanionFouDatabase
import com.caparepa.companionfou.data.db.dao.basic.*
import com.caparepa.companionfou.data.db.dao.nice.MysticCodeDao
import com.caparepa.companionfou.network.api.ApiClient
import com.caparepa.companionfou.network.interceptor.ConnectivityInterceptor
import com.caparepa.companionfou.network.interceptor.ConnectivityInterceptorImpl
import com.caparepa.companionfou.repository.basic.BasicDataRepository
import com.caparepa.companionfou.repository.basic.BasicDataRepositoryImpl
import com.caparepa.companionfou.repository.nice.MysticCodeRepository
import com.caparepa.companionfou.repository.nice.MysticCodeRepositoryImpl
import com.caparepa.companionfou.ui.viewmodel.BasicDataViewModel
import com.caparepa.companionfou.ui.viewmodel.MysticCodeViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val networkModule = module {
    single { ApiClient.invoke() }
    single<ConnectivityInterceptor> { ConnectivityInterceptorImpl(get()) }
}

val repositoryModule = module {
    factory<BasicDataRepository> { BasicDataRepositoryImpl() }
    factory<MysticCodeRepository> { MysticCodeRepositoryImpl(get()) }
}

val localModule = module {
    //Shared preferences here!
}

val databaseModule = module {
    //Database binding
    single { CompanionFouDatabase.invoke(androidContext()) }

    //Accessor binding
    fun provideBasicServantDao(database: CompanionFouDatabase): BasicServantDao {
        return database.getBasicServantDao()
    }

    fun provideBasicCommandCodeDao(database: CompanionFouDatabase): BasicCommandCodeDao {
        return database.getBasicCommandCodeDao()
    }

    fun provideBasicCraftEssenceDao(database: CompanionFouDatabase): BasicCraftEssenceDao {
        return database.getBasicCraftEssenceDao()
    }

    fun provideBasicMysticCodeDao(database: CompanionFouDatabase): BasicMysticCodeDao {
        return database.getBasicMysticCodeDao()
    }

    fun provideBasicMysticCodeMediaDao(database: CompanionFouDatabase): BasicMysticCodeMediaDao {
        return database.getBasicMysticCodeMediaDao()
    }

    fun provideMysticCodeDao(database: CompanionFouDatabase): MysticCodeDao {
        return database.getMysticCodeDao()
    }

    //DAO binding
    single { provideBasicServantDao(get()) }
    single { provideBasicCommandCodeDao(get()) }
    single { provideBasicCraftEssenceDao(get()) }
    single { provideBasicMysticCodeDao(get()) }
    single { provideBasicMysticCodeMediaDao(get()) }
    single { provideMysticCodeDao(get()) }

}

val viewModelModule = module {
    viewModel { BasicDataViewModel(androidContext(), get()) }
    viewModel { MysticCodeViewModel(androidContext(), get()) }
}
