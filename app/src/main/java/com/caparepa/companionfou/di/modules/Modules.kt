package com.caparepa.companionfou.di.modules

import com.caparepa.companionfou.data.db.CompanionFouDatabase
import com.caparepa.companionfou.data.db.dao.basic.*
import com.caparepa.companionfou.data.db.dao.general.*
import com.caparepa.companionfou.data.db.dao.nice.*
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

    //basic
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

    //general
    fun provideAllTraitsDao(database: CompanionFouDatabase): ServantTraitsDao {
        return database.getAllTraitsDao()
    }

    fun provideAttributeRelationDao(database: CompanionFouDatabase): AttributeRelationDao {
        return database.getAttributeRelationDao()
    }

    fun provideBuffActionListDao(database: CompanionFouDatabase): BuffActionListDao {
        return database.getBuffActionListDao()
    }

    fun provideClassAttackRateDao(database: CompanionFouDatabase): ClassAttackRateDao {
        return database.getClassAttackRateDao()
    }

    fun provideClassRelationDao(database: CompanionFouDatabase): ClassRelationDao {
        return database.getClassRelationDao()
    }

    fun provideFaceCardDao(database: CompanionFouDatabase): FaceCardDao {
        return database.getFaceCardDao()
    }

    fun provideGameEnumsDao(database: CompanionFouDatabase): GameEnumsDao {
        return database.getGameEnumsDao()
    }

    fun provideUserLevelDao(database: CompanionFouDatabase): UserLevelDao {
        return database.getUserLevelDao()
    }

    //general
    fun provideCommandCodeDao(database: CompanionFouDatabase): CommandCodeDao {
        return database.getCommandCodeDao()
    }

    fun provideCraftEssenceDao(database: CompanionFouDatabase): CraftEssenceDao {
        return database.getCraftEssenceDao()
    }

    fun provideMaterialDao(database: CompanionFouDatabase): MaterialDao {
        return database.getMaterialDao()
    }

    fun provideMysticCodeDao(database: CompanionFouDatabase): MysticCodeDao {
        return database.getMysticCodeDao()
    }

    fun provideServantDao(database: CompanionFouDatabase): ServantDao {
        return database.getServantDao()
    }

    //DAO binding

    //basic
    single { provideBasicServantDao(get()) }
    single { provideBasicCommandCodeDao(get()) }
    single { provideBasicCraftEssenceDao(get()) }
    single { provideBasicMysticCodeDao(get()) }
    single { provideBasicMysticCodeMediaDao(get()) }

    //general
    single { provideAllTraitsDao(get()) }
    single { provideAttributeRelationDao(get()) }
    single { provideBuffActionListDao(get()) }
    single { provideClassAttackRateDao(get()) }
    single { provideClassRelationDao(get()) }
    single { provideFaceCardDao(get()) }
    single { provideGameEnumsDao(get()) }
    single { provideUserLevelDao(get()) }

    //nice
    single { provideCommandCodeDao(get()) }
    single { provideCraftEssenceDao(get()) }
    single { provideMaterialDao(get()) }
    single { provideMysticCodeDao(get()) }
    single { provideServantDao(get()) }
}

val viewModelModule = module {
    viewModel { BasicDataViewModel(androidContext(), get()) }
    viewModel { MysticCodeViewModel(androidContext(), get()) }
}
