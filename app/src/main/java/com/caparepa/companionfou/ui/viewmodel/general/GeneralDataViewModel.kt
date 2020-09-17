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

class GeneralDataViewModel(val context: Context, generalDataRepository: GeneralDataRepository) :
    BaseViewModel(), KoinComponent {

    val generalInfoResult = MutableLiveData<Any>()
    val attributeRelationResult = MutableLiveData<AttributeRelationEntity>()
    val classAttackRateResult = MutableLiveData<ClassAttackRateEntity>()
    val classRelationResult = MutableLiveData<ClassRelationEntity>()
    val faceCardResult = MutableLiveData<FaceCardEntity>()
    val constantsResult = MutableLiveData<Any>()
    val buffActionListResult = MutableLiveData<BuffActionListEntity>()
    val userLevelResult = MutableLiveData<UserLevelEntity>()
    val allEnumsResult = MutableLiveData<GameEnumsEntity>()
    val traitMappingResult = MutableLiveData<ServantTraitEntity>()

    fun fetchGeneralInfo() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchGeneralInfoAsync()
        }
    }

    suspend fun fetchGeneralInfoAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun fetchAttributeRelation() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchAttributeRelationAsync()
        }
    }

    suspend fun fetchAttributeRelationAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun fetchClassAttackRate() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchClassAttackRateAsync()
        }
    }

    suspend fun fetchClassAttackRateAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun fetchClassRelation() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchClassRelationAsync()
        }
    }

    suspend fun fetchClassRelationAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun fetchFaceCard() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchFaceCardAsync()
        }
    }

    suspend fun fetchFaceCardAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun fetchConstants() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchConstantsAsync()
        }
    }

    suspend fun fetchConstantsAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun fetchBuffActionList() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchBuffActionListAsync()
        }
    }

    suspend fun fetchBuffActionListAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun fetchUserLevel() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchUserLevelAsync()
        }
    }

    suspend fun fetchUserLevelAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun fetchAllEnums() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchAllEnumsAsync()
        }
    }

    suspend fun fetchAllEnumsAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun fetchTraitMapping() {
        viewModelScope.launch(Dispatchers.Main) {
            fetchTraitMappingAsync()
        }
    }

    suspend fun fetchTraitMappingAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun getGeneralInfo() {
        viewModelScope.launch(Dispatchers.Main) {
            getGeneralInfoAsync()
        }
    }

    suspend fun getGeneralInfoAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun getAttributeRelation() {
        viewModelScope.launch(Dispatchers.Main) {
            getAttributeRelationAsync()
        }
    }

    suspend fun getAttributeRelationAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun getClassAttackRate() {
        viewModelScope.launch(Dispatchers.Main) {
            getClassAttackRateAsync()
        }
    }

    suspend fun getClassAttackRateAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun getClassRelation() {
        viewModelScope.launch(Dispatchers.Main) {
            getClassRelationAsync()
        }
    }

    suspend fun getClassRelationAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun getFaceCard() {
        viewModelScope.launch(Dispatchers.Main) {
            getFaceCardAsync()
        }
    }

    suspend fun getFaceCardAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun getConstants() {
        viewModelScope.launch(Dispatchers.Main) {
            getConstantsAsync()
        }
    }

    suspend fun getConstantsAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun getBuffActionList() {
        viewModelScope.launch(Dispatchers.Main) {
            getBuffActionListAsync()
        }
    }

    suspend fun getBuffActionListAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun getUserLevel() {
        viewModelScope.launch(Dispatchers.Main) {
            getUserLevelAsync()
        }
    }

    suspend fun getUserLevelAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun getAllEnums() {
        viewModelScope.launch(Dispatchers.Main) {
            getAllEnumsAsync()
        }
    }

    suspend fun getAllEnumsAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

    fun getTraitMapping() {
        viewModelScope.launch(Dispatchers.Main) {
            getTraitMappingAsync()
        }
    }

    suspend fun getTraitMappingAsync() {
        val result = kotlin.runCatching {  }

        with(result){
            onSuccess {  }
            onFailure {  }
        }
    }

}