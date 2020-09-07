package com.caparepa.companionfou.ui.activity

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.annotation.RawRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.caparepa.companionfou.R
import com.caparepa.companionfou.data.model.nice.servant.ServantItem
import com.caparepa.companionfou.ui.viewmodel.BasicDataViewModel
import com.caparepa.companionfou.utils.toastLong
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.core.KoinComponent
import org.koin.core.inject

class MainActivity : AppCompatActivity(), KoinComponent {

    private val basicDataViewModel: BasicDataViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observeBasicDataViewModel()
        theButton.setOnClickListener {
            try {
                basicDataViewModel.fetchBasicServantList()
            } catch (e: Exception) {
                Log.e("TATA", "nonono")
                e.printStackTrace()
            }
        }

    }

    private fun observeBasicDataViewModel() = basicDataViewModel.run {
        basicServantResponse.observe(this@MainActivity, Observer {
            it?.let {
                val shit = it
                this@MainActivity.toastLong("HELLO! YES!")
            }
        })
        basicServantList.observe(this@MainActivity, Observer {
            it?.let {
                if(it.isEmpty()) {
                    //if the list from the database is empty, get it from api
                    this.getBasicServantList()
                } else {
                    this@MainActivity.toastLong("JAJAJAJA")
                }
            }
        })
    }

    private fun createJsonObject(jsonString: String) {
        val gson = Gson()
        val obj = gson.fromJson(jsonString, ServantItem::class.java)
    }

    private inline fun <reified T> readRawJson(@RawRes rawResId: Int): T {
        resources.openRawResource(rawResId).bufferedReader().use {
            return Gson().fromJson<T>(it, object : TypeToken<T>() {}.type)
        }
    }
}