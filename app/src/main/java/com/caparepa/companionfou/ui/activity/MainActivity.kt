package com.caparepa.companionfou.ui.activity

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.annotation.RawRes
import androidx.appcompat.app.AppCompatActivity
import com.caparepa.companionfou.R
import com.caparepa.companionfou.data.model.nice.servant.ServantItem
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        theButton.setOnClickListener {
            try {

                val theList: ArrayList<ServantItem> =
                    readRawJson(R.raw.data_en_nice_servant)

                val itemList = theList.filter {
                    it.name?.contains("altria")!!
                }

                Log.d("TATA", "tttt ${theList.size}")
            } catch (e: Exception){
                Log.e("TATA", "nonono")
                e.printStackTrace()
            }
        }

    }

    private fun createJsonObject(jsonString: String) {
        val gson = Gson()
        val obj = gson.fromJson(jsonString, ServantItem::class.java)
    }

    private inline fun <reified T> readRawJson(@RawRes rawResId: Int): T {
        resources.openRawResource(rawResId).bufferedReader().use {
            return Gson().fromJson<T>(it, object: TypeToken<T>() {}.type)
        }
    }

    private fun loadJsonFromFile(context: Context):String? {
        try {
            return resources.openRawResource(R.raw.example)
                .bufferedReader().use{
                    it.readText()
                }

        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return ""
    }
}