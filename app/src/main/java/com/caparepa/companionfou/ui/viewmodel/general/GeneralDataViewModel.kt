package com.caparepa.companionfou.ui.viewmodel.general

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.general.*
import com.caparepa.companionfou.repository.general.GeneralDataRepository
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel
import com.caparepa.companionfou.utils.API_INFO
import com.caparepa.companionfou.utils.CURRENT_DATE
import com.caparepa.companionfou.utils.LOG_DEBUG
import com.caparepa.companionfou.utils.delegates.PreferenceDelegate.Companion.currentServer
import com.caparepa.companionfou.utils.logger
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class GeneralDataViewModel(
    val context: Context,
    private val generalDataRepository: GeneralDataRepository
) :
    BaseViewModel(), KoinComponent {

    val currentDateResult = MutableLiveData<String>()
    val apiInfoResult = MutableLiveData<ApiInfoEntity>()
    val attributeRelationResult = MutableLiveData<AttributeRelationEntity>()
    val classAttackRateResult = MutableLiveData<ClassAttackRateEntity>()
    val classRelationResult = MutableLiveData<ClassRelationEntity>()
    val faceCardResult = MutableLiveData<FaceCardEntity>()
    val constantsResult = MutableLiveData<GameEnumsEntity>()
    val buffActionListResult = MutableLiveData<BuffActionListEntity>()
    val userLevelResult = MutableLiveData<UserLevelEntity>()
    val allEnumsResult = MutableLiveData<GameEnumsEntity>()
    val traitMappingResult = MutableLiveData<ServantTraitEntity>()

    /**
     * Check this first
     */
    fun getLatestApiInfo() {
        viewModelScope.launch(Dispatchers.Main) {
            getLatestApiInfoAsync()
        }
    }

    private suspend fun getLatestApiInfoAsync() {
        val result = kotlin.runCatching {
            loadingState.postValue(true)
            generalDataRepository.getLatestInfo()
        }
        with(result) {
            onSuccess {
                loadingState.postValue(false)
                it?.let {
                    val currentDate = it.getFormattedCurrentDate()
                    currentDateResult.postValue(currentDate)
                }
            }
            onFailure {
                loadingState.postValue(false)
                onError.postValue(it.message)
            }
        }
    }

    /**
     * Api Info
     */

    /**
     * General flow
     * call fetch -> if in DB, postvalue in livedata
     * if not in DB, call get & persist
     * then call fetch again and return data
     * (all this in the view!)
     */

    fun fetchApiInfo() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchApiInfoAsync()
        }
    }

    private suspend fun fetchApiInfoAsync() {
        val result = kotlin.runCatching {
            loadingState.postValue(true)
            generalDataRepository.fetchApiInfo()
        }

        with(result) {
            onSuccess {
                loadingState.postValue(false)
                logger(LOG_DEBUG, "TAGTAG", "fetchApiInfoAsync -> $it")
                logger(LOG_DEBUG, "TAGTAG", "fetchApiInfoAsync -> Hay data!")
                apiInfoResult.postValue(it)
            }
            onFailure {
                logger(LOG_DEBUG, "TAGTAG", "fetchApiInfoAsync -> No hay data! Error!")
                onError.postValue(it.message)
            }
        }
    }

    fun getApiInfo() {
        viewModelScope.launch(Dispatchers.Main) {
            getApiInfoAsync(CURRENT_DATE)
        }
    }

    private suspend fun getApiInfoAsync(currentDate: String) {
        val result = kotlin.runCatching {
            loadingState.postValue(true)
            generalDataRepository.getApiInfo(currentDate)
        }

        with(result) {
            onSuccess {
                loadingState.postValue(false)
                logger(LOG_DEBUG, "TAGTAG", "getApiInfoAsync -> $it")
                if(it != null) {
                    logger(LOG_DEBUG, "TAGTAG", "getApiInfoAsync -> Hay data de API!")
                    onGetSuccess.postValue(mapOf(API_INFO to true))
                } else {
                    logger(LOG_DEBUG, "TAGTAG", "getApiInfoAsync -> NO hay data de API!")
                    onGetSuccess.postValue(mapOf(API_INFO to false))
                }
            }
            onFailure {
                logger(LOG_DEBUG, "TAGTAG", "getApiInfoAsync -> No hay data de API! Error!")
                onError.postValue(it.message)
            }
        }
    }

    /**
     * Attribute Relation
     */

    fun fetchAttributeRelation(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            fetchAttributeRelationAsync(server)
        }
    }

    private suspend fun fetchAttributeRelationAsync(server: String) {
        val result = kotlin.runCatching {
            generalDataRepository.fetchAttributeRelation(server)
        }

        with(result) {
            onSuccess {
                it?.let {
                    attributeRelationResult.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    fun getAttributeRelation(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            getAttributeRelationAsync(server)
        }
    }

    private suspend fun getAttributeRelationAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    /**
     * Class Attack Rate
     */

    fun fetchClassAttackRate(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            fetchClassAttackRateAsync(server)
        }
    }

    private suspend fun fetchClassAttackRateAsync(server: String) {
        val result = kotlin.runCatching {
            generalDataRepository.fetchClassAttackRate(server)
        }

        with(result) {
            onSuccess {
                it?.let {
                    classAttackRateResult.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    fun getClassAttackRate(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            getClassAttackRateAsync(server)
        }
    }

    private suspend fun getClassAttackRateAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    /**
     * Class Relation
     */

    fun fetchClassRelation(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            fetchClassRelationAsync(server)
        }
    }

    private suspend fun fetchClassRelationAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    fun getClassRelation(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            getClassRelationAsync(server)
        }
    }

    private suspend fun getClassRelationAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    /**
     * Face Card
     */

    fun fetchFaceCard(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            fetchFaceCardAsync(server)
        }
    }

    private suspend fun fetchFaceCardAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    fun getFaceCard(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            getFaceCardAsync(server)
        }
    }

    private suspend fun getFaceCardAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    /**
     * Game Constants
     */

    fun fetchConstants(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            fetchConstantsAsync(server)
        }
    }

    private suspend fun fetchConstantsAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    fun getConstants(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            getConstantsAsync(server)
        }
    }

    private suspend fun getConstantsAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    /**
     * Buff Action List
     */

    fun fetchBuffActionList(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            fetchBuffActionListAsync(server)
        }
    }

    private suspend fun fetchBuffActionListAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    fun getBuffActionList(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            getBuffActionListAsync(server)
        }
    }

    private suspend fun getBuffActionListAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    /**
     * User Level List
     */

    fun fetchUserLevel(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            fetchUserLevelAsync(server)
        }
    }

    private suspend fun fetchUserLevelAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    fun getUserLevel(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            getUserLevelAsync(server)
        }
    }

    private suspend fun getUserLevelAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    /**
     * Game Enums
     */

    fun fetchGameEnums(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            fetchGameEnumsAsync(server)
        }
    }

    private suspend fun fetchGameEnumsAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    fun getGameEnums(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            getGameEnumsAsync(server)
        }
    }

    private suspend fun getGameEnumsAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    /**
     * Trait Mapping
     */

    fun fetchTraitMapping(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            fetchTraitMappingAsync(server)
        }
    }

    private suspend fun fetchTraitMappingAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    fun getTraitMapping(server: String) {
        viewModelScope.launch(Dispatchers.Main) {
            getTraitMappingAsync(server)
        }
    }

    private suspend fun getTraitMappingAsync(server: String) {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess {
                it?.let {

                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

}