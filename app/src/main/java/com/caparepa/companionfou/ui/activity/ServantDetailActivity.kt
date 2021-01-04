package com.caparepa.companionfou.ui.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.caparepa.companionfou.R
import com.caparepa.companionfou.utils.LOG_DEBUG
import com.caparepa.companionfou.utils.REGION_SERVER
import com.caparepa.companionfou.utils.SERVANT_ID
import com.caparepa.companionfou.utils.logger
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_servant_detail.*

class ServantDetailActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    var fragment: String    = ""

    private var servantId: Long? = 0
    private var server: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servant_detail)
        getBundleData()
        initBottomNavigationView()
    }

    private fun getBundleData() {
        servantId = intent.extras?.getLong("SERVANT_COLLECTION_NO")
        server = intent.extras?.getString("SERVER")
    }

    @SuppressLint("RestrictedApi")
    private fun initBottomNavigationView() {
        navController =
            Navigation.findNavController(this@ServantDetailActivity, R.id.servant_nav_host_fragment)
        bottom_servant_navigation?.inflateMenu(R.menu.bottom_servant_menu)
        this.let { _ ->
            bottom_servant_navigation?.setupWithNavController(navController)
            bottom_servant_navigation?.setOnNavigationItemReselectedListener {
                // Do nothing to ignore the reselection
            }
            navController.addOnDestinationChangedListener { controller, destination, arguments ->
                logger(LOG_DEBUG, "TAGA", destination.displayName)
                arguments?.putLong(SERVANT_ID, servantId!!)
                arguments?.putString(REGION_SERVER, server!!)
            }
        }
        //TODO: DO SHENANIGANS HERE FOR NAVIGATION!!!
        /*when(screen){
            "foodLog" -> Navigation.findNavController(requireActivity(),R.id.home_nav_host_fragment).navigate(R.id.foodLogFragment)
            "programs" -> Navigation.findNavController(requireActivity(),R.id.home_nav_host_fragment).navigate(R.id.programFragment)
            else -> {}
        }*/
    }

}