package com.caparepa.companionfou.data.model.nice.test


import com.google.gson.annotations.SerializedName

class ClassPassiveList : ArrayList<ClassPassiveList.ClassPassiveListItem>(){
    data class ClassPassiveListItem(
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("detail")
        val detail: String? = null,
        @SerializedName("type")
        val type: String? = null,
        @SerializedName("icon")
        val icon: String? = null,
        @SerializedName("coolDown")
        val coolDown: List<Int?>? = null,
        @SerializedName("actIndividuality")
        val actIndividuality: List<Any?>? = null,
        @SerializedName("script")
        val script: Script? = null,
        @SerializedName("functions")
        val functions: List<Function?>? = null
    ) {
        class Script(
        )
    
        data class Function(
            @SerializedName("funcId")
            val funcId: Int? = null,
            @SerializedName("funcType")
            val funcType: String? = null,
            @SerializedName("funcTargetType")
            val funcTargetType: String? = null,
            @SerializedName("funcTargetTeam")
            val funcTargetTeam: String? = null,
            @SerializedName("funcPopupText")
            val funcPopupText: String? = null,
            @SerializedName("funcPopupIcon")
            val funcPopupIcon: String? = null,
            @SerializedName("functvals")
            val functvals: List<Any?>? = null,
            @SerializedName("funcquestTvals")
            val funcquestTvals: List<Any?>? = null,
            @SerializedName("buffs")
            val buffs: List<Buff?>? = null,
            @SerializedName("svals")
            val svals: List<Sval?>? = null
        ) {
            data class Buff(
                @SerializedName("id")
                val id: Int? = null,
                @SerializedName("name")
                val name: String? = null,
                @SerializedName("detail")
                val detail: String? = null,
                @SerializedName("icon")
                val icon: String? = null,
                @SerializedName("type")
                val type: String? = null,
                @SerializedName("buffGroup")
                val buffGroup: Int? = null,
                @SerializedName("vals")
                val vals: List<Val?>? = null,
                @SerializedName("tvals")
                val tvals: List<Any?>? = null,
                @SerializedName("ckSelfIndv")
                val ckSelfIndv: List<Any?>? = null,
                @SerializedName("ckOpIndv")
                val ckOpIndv: List<Any?>? = null,
                @SerializedName("maxRate")
                val maxRate: Int? = null
            ) {
                data class Val(
                    @SerializedName("id")
                    val id: Int? = null,
                    @SerializedName("name")
                    val name: String? = null
                )
            }
    
            data class Sval(
                @SerializedName("Rate")
                val rate: Int? = null,
                @SerializedName("Turn")
                val turn: Int? = null,
                @SerializedName("Count")
                val count: Int? = null,
                @SerializedName("Value")
                val value: Int? = null
            )
        }
    }
}