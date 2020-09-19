package com.caparepa.companionfou.ui.viewmodel.general

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.caparepa.companionfou.data.db.entity.general.*
import com.caparepa.companionfou.repository.general.GeneralDataRepository
import com.caparepa.companionfou.ui.viewmodel.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class GeneralDataViewModel(val context: Context, val generalDataRepository: GeneralDataRepository) :
    BaseViewModel(), KoinComponent {

    val generalInfoResult = MutableLiveData<ApiInfoEntity>()
    val attributeRelationResult = MutableLiveData<AttributeRelationEntity>()
    val classAttackRateResult = MutableLiveData<ClassAttackRateEntity>()
    val classRelationResult = MutableLiveData<ClassRelationEntity>()
    val faceCardResult = MutableLiveData<FaceCardEntity>()
    val constantsResult = MutableLiveData<GameEnumsEntity>()
    val buffActionListResult = MutableLiveData<BuffActionListEntity>()
    val userLevelResult = MutableLiveData<UserLevelEntity>()
    val allEnumsResult = MutableLiveData<GameEnumsEntity>()
    val traitMappingResult = MutableLiveData<ServantTraitEntity>()

    fun fetchGeneralInfo() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchGeneralInfoAsync()
        }
    }

    private suspend fun fetchGeneralInfoAsync() {
        val result = kotlin.runCatching {
            generalDataRepository.fetchApiInfo()
        }

        with(result) {
            onSuccess {
                it?.let {
                    generalInfoResult.postValue(it)
                }
            }
            onFailure {
                onError.postValue(it.message)
            }
        }
    }

    fun fetchAttributeRelation() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchAttributeRelationAsync()
        }
    }

    private suspend fun fetchAttributeRelationAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun fetchClassAttackRate() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchClassAttackRateAsync()
        }
    }

    private suspend fun fetchClassAttackRateAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun fetchClassRelation() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchClassRelationAsync()
        }
    }

    private suspend fun fetchClassRelationAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun fetchFaceCard() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchFaceCardAsync()
        }
    }

    private suspend fun fetchFaceCardAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun fetchConstants() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchConstantsAsync()
        }
    }

    private suspend fun fetchConstantsAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun fetchBuffActionList() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchBuffActionListAsync()
        }
    }

    private suspend fun fetchBuffActionListAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun fetchUserLevel() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchUserLevelAsync()
        }
    }

    private suspend fun fetchUserLevelAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun fetchAllEnums() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchAllEnumsAsync()
        }
    }

    private suspend fun fetchAllEnumsAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun fetchTraitMapping() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchTraitMappingAsync()
        }
    }

    private suspend fun fetchTraitMappingAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun getGeneralInfo() {
        viewModelScope.launch(Dispatchers.Main) {
            getGeneralInfoAsync()
        }
    }

    private suspend fun getGeneralInfoAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun getAttributeRelation() {
        viewModelScope.launch(Dispatchers.Main) {
            getAttributeRelationAsync()
        }
    }

    private suspend fun getAttributeRelationAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun getClassAttackRate() {
        viewModelScope.launch(Dispatchers.Main) {
            getClassAttackRateAsync()
        }
    }

    private suspend fun getClassAttackRateAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun getClassRelation() {
        viewModelScope.launch(Dispatchers.Main) {
            getClassRelationAsync()
        }
    }

    private suspend fun getClassRelationAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun getFaceCard() {
        viewModelScope.launch(Dispatchers.Main) {
            getFaceCardAsync()
        }
    }

    private suspend fun getFaceCardAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun getConstants() {
        viewModelScope.launch(Dispatchers.Main) {
            getConstantsAsync()
        }
    }

    private suspend fun getConstantsAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun getBuffActionList() {
        viewModelScope.launch(Dispatchers.Main) {
            getBuffActionListAsync()
        }
    }

    private suspend fun getBuffActionListAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun getUserLevel() {
        viewModelScope.launch(Dispatchers.Main) {
            getUserLevelAsync()
        }
    }

    private suspend fun getUserLevelAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun getAllEnums() {
        viewModelScope.launch(Dispatchers.Main) {
            getAllEnumsAsync()
        }
    }

    private suspend fun getAllEnumsAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

    fun getTraitMapping() {
        viewModelScope.launch(Dispatchers.Main) {
            getTraitMappingAsync()
        }
    }

    private suspend fun getTraitMappingAsync() {
        val result = kotlin.runCatching { }

        with(result) {
            onSuccess { }
            onFailure { }
        }
    }

}