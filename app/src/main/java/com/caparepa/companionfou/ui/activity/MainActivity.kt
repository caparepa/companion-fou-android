package com.caparepa.companionfou.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.caparepa.companionfou.R
import com.caparepa.companionfou.ui.dialog.LoadingDialog
import com.caparepa.companionfou.ui.viewmodel.basic.BasicDataViewModel
import com.caparepa.companionfou.ui.viewmodel.general.GeneralDataViewModel
import com.caparepa.companionfou.ui.viewmodel.nice.MysticCodeViewModel
import com.caparepa.companionfou.utils.API_INFO
import com.caparepa.companionfou.utils.LOG_DEBUG
import com.caparepa.companionfou.utils.logger
import com.caparepa.companionfou.utils.toastLong
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.core.KoinComponent
import org.koin.core.inject

class MainActivity : AppCompatActivity(), KoinComponent {

    private val generalDataViewModel: GeneralDataViewModel by inject()

    private lateinit var loadingDialog: LoadingDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun observeGeneralDataViewModel() = generalDataViewModel.run {
        apiInfoResult.observe(this@MainActivity, Observer {
            if (it != null) {
                logger(LOG_DEBUG, "TAGTAG", "Hay info de DB!")
                logger(LOG_DEBUG, "TAGTAG", it.toString())

            } else {
                logger(LOG_DEBUG, "TAGTAG", "No hay info de DB! Hay que jalar de APAI!")
                generalDataViewModel.getApiInfo()
            }
        })
        onError.observe(this@MainActivity, Observer {
            it?.let {
                logger(LOG_DEBUG, "TAGTAG", "onError $it")

            }
        })
        onGetSuccess.observe(this@MainActivity, Observer {
            it?.let {
                if (it.containsKey(API_INFO) && it.get(API_INFO) == true) {
                    logger(LOG_DEBUG, "TAGTAG", "Ya jalo data de API! $it")
                    generalDataViewModel.fetchApiInfo()
                }
            }
        })

        loadingState.observe(this@MainActivity, Observer {
            if (it) {
                loadingDialog.setCanceledOnTouchOutside(false)
                loadingDialog.show()
            } else {
                loadingDialog.dismiss()
            }
        })
    }

}