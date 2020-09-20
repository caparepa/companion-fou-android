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

    private val generalDataViewModel: GeneralDataViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observeGeneralDataViewModel()

        theButton.setOnClickListener {
            try {
                generalDataViewModel.fetchApiInfo()
            } catch (e: Exception) {
                Log.e("TATA", "nonono")
                e.printStackTrace()
            }
        }

    }

    private fun observeGeneralDataViewModel() = generalDataViewModel.run {
        apiInfoResult.observe(this@MainActivity, Observer {
            it?.let {
               this@MainActivity.toastLong(it.toString())
            }
        })
        onError.observe(this@MainActivity, Observer{
            it?.let {
                this@MainActivity.toastLong(it)
            }
        })
        onGetSuccess.observe(this@MainActivity, Observer{
            it?.let {
                if(it.containsKey(API_INFO) && it.get(API_INFO) == true)
                    generalDataViewModel.fetchApiInfo()
            }
        })
    }

}