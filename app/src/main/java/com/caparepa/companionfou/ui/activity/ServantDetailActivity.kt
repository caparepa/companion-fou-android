package com.caparepa.companionfou.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.caparepa.companionfou.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_servant_detail.*

class ServantDetailActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    var fragment: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servant_detail)
        initBottomNavigationView()
    }

    private fun initBottomNavigationView() {
        navController =
            Navigation.findNavController(this@ServantDetailActivity, R.id.servant_nav_host_fragment)
        bottom_servant_navigation?.inflateMenu(R.menu.bottom_servant_menu)
        this.let { _ ->
            bottom_servant_navigation?.setupWithNavController(navController)
            bottom_servant_navigation?.setOnNavigationItemReselectedListener {
                // Do nothing to ignore the reselection
            }
            navController.addOnDestinationChangedListener { _, destination, _ ->

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