package com.caparepa.companionfou.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.caparepa.companionfou.data.db.dao.basic.*
import com.caparepa.companionfou.data.db.dao.general.*
import com.caparepa.companionfou.data.db.dao.nice.*
import com.caparepa.companionfou.data.db.entity.basic.*
import com.caparepa.companionfou.data.db.entity.general.*
import com.caparepa.companionfou.data.db.entity.nice.*

@Database(
    entities =
    [
        BasicServantItem::class,
        BasicCommandCode::class,
        BasicCraftEssence::class,
        BasicMysticCode::class,
        BasicMysticCodeMedia::class,
        ApiInfoEntity::class,
        AttributeRelationEntity::class,
        BuffActionListEntity::class,
        ClassAttackRateEntity::class,
        ClassRelationEntity::class,
        FaceCardEntity::class,
        GameEnumsEntity::class,
        ServantTraitEntity::class,
        UserLevelEntity::class,
        GameConstantsEntity::class,
        CommandCodeEntity::class,
        CraftEssenceEntity::class,
        MaterialEntity::class,
        MysticCodeEntity::class,
        ServantEntity::class
    ],
    version = 2,
    exportSchema = false
)
abstract class CompanionFouDatabase : RoomDatabase() {

    //basic
    abstract fun getBasicServantDao(): BasicServantDao
    abstract fun getBasicCraftEssenceDao(): BasicCraftEssenceDao
    abstract fun getBasicMysticCodeDao(): BasicMysticCodeDao
    abstract fun getBasicMysticCodeMediaDao(): BasicMysticCodeMediaDao
    abstract fun getBasicCommandCodeDao(): BasicCommandCodeDao

    //general data
    abstract fun getApiInfoDao(): ApiInfoDao
    abstract fun getAllTraitsDao(): ServantTraitsDao
    abstract fun getAttributeRelationDao(): AttributeRelationDao
    abstract fun getBuffActionListDao(): BuffActionListDao
    abstract fun getClassAttackRateDao(): ClassAttackRateDao
    abstract fun getClassRelationDao(): ClassRelationDao
    abstract fun getFaceCardDao(): FaceCardDao
    abstract fun getGameEnumsDao(): GameEnumsDao
    abstract fun getUserLevelDao(): UserLevelDao
    abstract fun getUserConstantsDao(): GameConstantsDao

    //nice
    abstract fun getCommandCodeDao(): CommandCodeDao
    abstract fun getCraftEssenceDao(): CraftEssenceDao
    abstract fun getMaterialDao(): MaterialDao
    abstract fun getMysticCodeDao(): MysticCodeDao
    abstract fun getServantDao(): ServantDao

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