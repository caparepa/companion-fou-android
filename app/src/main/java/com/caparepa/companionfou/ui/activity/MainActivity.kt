package com.caparepa.companionfou.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.caparepa.companionfou.R
import com.caparepa.companionfou.ui.viewmodel.basic.BasicDataViewModel
import com.caparepa.companionfou.ui.viewmodel.general.GeneralDataViewModel
import com.caparepa.companionfou.ui.viewmodel.nice.MysticCodeViewModel
import com.caparepa.companionfou.utils.API_INFO
import com.caparepa.companionfou.utils.toastLong
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.core.KoinComponent
import org.koin.core.inject

class MainActivity : AppCompatActivity(), KoinComponent {

    private val basicDataViewModel: BasicDataViewModel by inject()
    private val mysticCodeViewModel: MysticCodeViewModel by inject()
    private val generalDataViewModel: GeneralDataViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observeBasicDataViewModel()
        observeMysticCodeViewModel()
        theButton.setOnClickListener {
            try {
                //basicDataViewModel.getBasicServantList()
                mysticCodeViewModel.fetchMysticCodes()
            } catch (e: Exception) {
                Log.e("TATA", "nonono")
                e.printStackTrace()
            }
        }

    }

    private fun observeGeneralDataViewModel() = generalDataViewModel.run {
        apiInfoResult.observe(this@MainActivity, Observer {

        })
        onError.observe(this@MainActivity, Observer{

        })
        onGetSuccess.observe(this@MainActivity, Observer{
            it?.let {

            }
        })
    }

    private fun observeBasicDataViewModel() = basicDataViewModel.run {
        basicServantResponse.observe(this@MainActivity, Observer {
            it?.let {
                tvTest.text = it.toString()
                this@MainActivity.toastLong("HELLO! YES!")
            }
        })
    }

    private fun observeMysticCodeViewModel() = mysticCodeViewModel.run {
        mysticCodeListResponse.observe(this@MainActivity, Observer {
            it?.let {
                this@MainActivity.toastLong("response!")
            }
        })
        mysticCodeListResult.observe(this@MainActivity, Observer {
            if(!it.isNullOrEmpty()) {
                this@MainActivity.toastLong("RESULT!")
            } else {
                this.getMysticCodes()
            }
        })
    }
}