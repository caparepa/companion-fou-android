package com.caparepa.companionfou.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.caparepa.companionfou.data.db.dao.basic.*
import com.caparepa.companionfou.data.db.dao.nice.MysticCodeDao
import com.caparepa.companionfou.data.db.entity.basic.*
import com.caparepa.companionfou.data.db.entity.nice.MysticCode
import com.caparepa.companionfou.utils.converters.NiceDataConverter

@Database(
    entities =
    [
        BasicServantItem::class,
        BasicCommandCode::class,
        BasicCraftEssence::class,
        BasicMysticCode::class,
        BasicMysticCodeMedia::class,
        MysticCode::class
    ],
    version = 2,
    exportSchema = false
)
@TypeConverters(NiceDataConverter::class)
abstract class CompanionFouDatabase : RoomDatabase() {

    //basic
    abstract fun getBasicServantDao(): BasicServantDao
    abstract fun getBasicCraftEssenceDao(): BasicCraftEssenceDao
    abstract fun getBasicMysticCodeDao(): BasicMysticCodeDao
    abstract fun getBasicMysticCodeMediaDao(): BasicMysticCodeMediaDao
    abstract fun getBasicCommandCodeDao(): BasicCommandCodeDao

    //nice
    abstract fun getMysticCodeDao(): MysticCodeDao

    companion object {

        @Volatile
        private var instance: CompanionFouDatabase? = null

        private val LOCK = Any()


        operator fun invoke(context: Context) = instance
            ?: synchronized(LOCK) {
                //if there is no instance, build a database (buildDatabase(context))
                //and also, whatever is returned from the builder, set the instance equal to "it"
                instance
                    ?: buildDatabase(
                        context
                    ).also {
                        instance = it
                    }
            }

        //We create a function to build the database, which will receive the application context
        ///This builder will initialize the database java class for the app (CompanionFouDatabase)
        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                CompanionFouDatabase::class.java, "companionfou.db"
            ).fallbackToDestructiveMigration().build()

    }

}