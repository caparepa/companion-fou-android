package com.caparepa.companionfou.ui.viewmodel.general

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.general.*
import com.caparepa.companionfou.data.model.general.attackrate.ClassAttackRate
import com.caparepa.companionfou.data.model.general.attribute.AttributeRelation
import com.caparepa.companionfou.data.model.general.buffaction.BuffActionList
import com.caparepa.companionfou.data.model.general.classrelation.ClassRelationList
import com.caparepa.companionfou.data.model.general.facecards.FaceCardList
import com.caparepa.companionfou.data.model.general.other.ApiInfo
import com.caparepa.companionfou.data.model.general.other.GameConstants
import com.caparepa.companionfou.data.model.general.other.GameEnums
import com.caparepa.companionfou.data.model.general.userlevel.UserLevelList
import com.caparepa.companionfou.repository.general.GeneralDataRepository
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel
import com.caparepa.companionfou.utils.*
import com.caparepa.companionfou.utils.delegates.PreferenceDelegate.Companion.currentDate
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class GeneralDataViewModel(
    val context: Context,
    private val generalDataRepository: GeneralDataRepository
) :
    BaseViewModel(), KoinComponent {

    val TAG = "Log@GeneralDataViewModel"

    val currentDateResult = MutableLiveData<String>()

    val apiInfoResult = MutableLiveData<ApiInfoEntity>()
    val attributeRelationResult = MutableLiveData<AttributeRelationEntity>()
    val classAttackRateResult = MutableLiveData<ClassAttackRateEntity>()
    val classRelationResult = MutableLiveData<ClassRelationEntity>()
    val faceCardResult = MutableLiveData<FaceCardEntity>()
    val constantsResult = MutableLiveData<GameConstantsEntity>()
    val buffActionListResult = MutableLiveData<BuffActionListEntity>()
    val userLevelResult = MutableLiveData<UserLevelEntity>()
    val allEnumsResult = MutableLiveData<GameEnumsEntity>()
    val traitMappingResult = MutableLiveData<ServantTraitEntity>()

    val apiInfoResponse = MutableLiveData<ApiInfo>()
    val attributeRelationResponse = MutableLiveData<AttributeRelation>()
    val classAttackRateResponse = MutableLiveData<ClassAttackRate>()
    val classRelationResponse = MutableLiveData<ClassRelationList>()
    val faceCardResponse = MutableLiveData<FaceCardList>()
    val constantsResponse = MutableLiveData<GameConstants>()
    val buffActionListResponse = MutableLiveData<BuffActionList>()
    val userLevelResponse = MutableLiveData<UserLevelList>()
    val allEnumsResponse = MutableLiveData<GameEnums>()
    val traitMappingResponse = MutableLiveData<Map<Int, String>?>()

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
                logger(LOG_DEBUG, TAG, "fetchApiInfoAsync -> $it")
                logger(LOG_DEBUG, TAG, "fetchApiInfoAsync -> Hay data!")
                apiInfoResult.postValue(it)
            }
            onFailure {
                logger(LOG_DEBUG, TAG, "fetchApiInfoAsync -> No hay data! Error!")
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
            generalDataRepository.getApiInfo(currentDate)
        }

        with(result) {
            onSuccess {
                logger(LOG_DEBUG, TAG, "getApiInfoAsync -> $it")
                it?.let {
                    logger(LOG_DEBUG, TAG, "getApiInfoAsync -> API DATA!")
                    onGetSuccess.postValue(OGS_API_INFO)
                }
            }
            onFailure {
                logger(LOG_DEBUG, TAG, "getApiInfoAsync -> NO API DATA! Error!")
                onGetError.postValue(OGS_API_INFO)
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
            loadingState.postValue(true)
            generalDataRepository.fetchAttributeRelation(server)
        }

        with(result) {
            onSuccess {
                loadingState.postValue(false)
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
        val result = kotlin.runCatching {
            generalDataRepository.getAttributeRelation(server, currentDate)
        }

        with(result) {
            onSuccess {
                logger(LOG_DEBUG, TAG, "getAttributeRelationAsync -> $it")
                it?.let {
                    logger(LOG_DEBUG, TAG, "getAttributeRelationAsync -> API DATA!")
                    onGetSuccess.postValue(OGS_ATTRIBUTE_RELATION)
                }
            }
            onFailure {
                logger(LOG_DEBUG, TAG, "getAttributeRelationAsync -> NO API DATA! Error!")
                onGetError.postValue(OGS_ATTRIBUTE_RELATION)
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
            loadingState.postValue(true)
            generalDataRepository.fetchClassAttackRate(server)
        }

        with(result) {
            onSuccess {
                loadingState.postValue(false)
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
        val result = kotlin.runCatching {
            generalDataRepository.getClassAttackRate(server, currentDate)
        }

        with(result) {
            onSuccess {
                logger(LOG_DEBUG, TAG, "getClassAttackRateAsync -> $it")
                it?.let {
                    logger(LOG_DEBUG, TAG, "getClassAttackRateAsync -> API DATA!")
                    onGetSuccess.postValue(OGS_CLASS_ATTACK_RATE)
                }
            }
            onFailure {
                logger(LOG_DEBUG, TAG, "getClassAttackRateAsync -> NO API DATA! Error!")
                onGetError.postValue(OGS_CLASS_ATTACK_RATE)
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
        val result = kotlin.runCatching {
            loadingState.postValue(true)
            generalDataRepository.fetchClassRelation(server)
        }

        with(result) {
            onSuccess {
                loadingState.postValue(false)
                it?.let {
                    classRelationResult.postValue(it)
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
        val result = kotlin.runCatching {
            generalDataRepository.getClassRelation(server, currentDate)
        }

        with(result) {
            onSuccess {
                logger(LOG_DEBUG, TAG, "getClassRelationAsync -> $it")
                it?.let {
                    logger(LOG_DEBUG, TAG, "getClassRelationAsync -> API DATA!")
                    onGetSuccess.postValue(OGS_CLASS_RELATION)
                }
            }
            onFailure {
                logger(LOG_DEBUG, TAG, "getClassRelationAsync -> NO API DATA! Error!")
                onGetError.postValue(OGS_CLASS_RELATION)
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
        val result = kotlin.runCatching {
            loadingState.postValue(true)
            generalDataRepository.fetchFaceCard(server)
        }

        with(result) {
            onSuccess {
                loadingState.postValue(false)
                it?.let {
                    faceCardResult.postValue(it)
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
        val result = kotlin.runCatching {
            generalDataRepository.getFaceCard(server, currentDate)
        }

        with(result) {
            onSuccess {
                logger(LOG_DEBUG, TAG, "getFaceCardAsync -> $it")
                it?.let {
                    logger(LOG_DEBUG, TAG, "getFaceCardAsync -> API DATA!")
                    onGetSuccess.postValue(OGS_FACE_CARD)
                }
            }
            onFailure {
                logger(LOG_DEBUG, TAG, "getFaceCardAsync -> NO API DATA! Error!")
                onGetError.postValue(OGS_FACE_CARD)
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
        val result = kotlin.runCatching {
            loadingState.postValue(true)
            generalDataRepository.fetchGameConstants(server)
        }

        with(result) {
            onSuccess {
                loadingState.postValue(false)
                it?.let {
                    constantsResult.postValue(it)
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
        val result = kotlin.runCatching {
            generalDataRepository.getGameConstants(server, currentDate)
        }

        with(result) {
            onSuccess {
                logger(LOG_DEBUG, TAG, "getConstantsAsync -> $it")
                it?.let {
                    logger(LOG_DEBUG, TAG, "getConstantsAsync -> API DATA!")
                    onGetSuccess.postValue(OGS_GAME_CONSTANTS)
                }
            }
            onFailure {
                logger(LOG_DEBUG, TAG, "getConstantsAsync -> NO API DATA! Error!")
                onGetError.postValue(OGS_GAME_CONSTANTS)
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
        val result = kotlin.runCatching {
            loadingState.postValue(true)
            generalDataRepository.fetchBuffActionList(server)
        }

        with(result) {
            onSuccess {
                loadingState.postValue(false)
                it?.let {
                    buffActionListResult.postValue(it)
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
        val result = kotlin.runCatching {
            generalDataRepository.getBuffActionList(server, currentDate)
        }

        with(result) {
            onSuccess {
                logger(LOG_DEBUG, TAG, "getBuffActionListAsync -> $it")
                it?.let {
                    logger(LOG_DEBUG, TAG, "getBuffActionListAsync -> API DATA!")
                    onGetSuccess.postValue(OGS_BUFF_ACTION_LIST)
                }
            }
            onFailure {
                logger(LOG_DEBUG, TAG, "getBuffActionListAsync -> NO API DATA! Error!")
                onGetError.postValue(OGS_BUFF_ACTION_LIST)
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
        val result = kotlin.runCatching {
            loadingState.postValue(true)
            generalDataRepository.fetchUserLevel(server)
        }

        with(result) {
            onSuccess {
                loadingState.postValue(false)
                it?.let {
                    userLevelResult.postValue(it)
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
        val result = kotlin.runCatching {
            generalDataRepository.getUserLevel(server, currentDate)
        }

        with(result) {
            onSuccess {
                logger(LOG_DEBUG, TAG, "getUserLevelAsync -> $it")
                it?.let {
                    logger(LOG_DEBUG, TAG, "getUserLevelAsync -> API DATA!")
                    onGetSuccess.postValue(OGS_USER_LEVEL)
                }
            }
            onFailure {
                logger(LOG_DEBUG, TAG, "getUserLevelAsync -> NO API DATA! Error!")
                onGetError.postValue(OGS_USER_LEVEL)
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
        val result = kotlin.runCatching {
            loadingState.postValue(true)
            generalDataRepository.fetchGameEnums(server)
        }

        with(result) {
            onSuccess {
                loadingState.postValue(false)
                it?.let {
                    allEnumsResult.postValue(it)
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
        val result = kotlin.runCatching {
            generalDataRepository.getGameEnums(server, currentDate)
        }

        with(result) {
            onSuccess {
                logger(LOG_DEBUG, TAG, "getGameEnumsAsync -> $it")
                it?.let {
                    logger(LOG_DEBUG, TAG, "getGameEnumsAsync -> API DATA!")
                    onGetSuccess.postValue(OGS_ALL_ENUMS)
                }
            }
            onFailure {
                logger(LOG_DEBUG, TAG, "getGameEnumsAsync -> NO API DATA! Error!")
                onGetError.postValue(OGS_ALL_ENUMS)
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
        val result = kotlin.runCatching {
            loadingState.postValue(true)
            generalDataRepository.fetchTraitMapping(server)
        }

        with(result) {
            onSuccess {
                loadingState.postValue(false)
                it?.let {
                    traitMappingResult.postValue(it)
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
        val result = kotlin.runCatching {
            generalDataRepository.getTraitMapping(server, currentDate)
        }

        with(result) {
            onSuccess {
                logger(LOG_DEBUG, TAG, "getTraitMappingAsync -> $it")
                it?.let {
                    logger(LOG_DEBUG, TAG, "getTraitMappingAsync -> API DATA!")
                    onGetSuccess.postValue(OGS_TRAIT_MAPPING)
                }
            }
            onFailure {
                logger(LOG_DEBUG, TAG, "getTraitMappingAsync -> NO API DATA! Error!")
                onGetError.postValue(OGS_TRAIT_MAPPING)
                onError.postValue(it.message)
            }
        }
    }

}