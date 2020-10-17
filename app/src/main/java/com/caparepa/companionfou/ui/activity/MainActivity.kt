package com.caparepa.companionfou.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.caparepa.companionfou.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.core.KoinComponent

class MainActivity : AppCompatActivity(), KoinComponent {

    private lateinit var navController: NavController
    var fragment: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initBottomNavigationView()
    }

    private fun initBottomNavigationView() {
        navController =
            Navigation.findNavController(this@MainActivity, R.id.home_nav_host_fragment)
        bottom_navigation?.inflateMenu(R.menu.bottom_menu)
        this.let { _ ->
            bottom_navigation?.setupWithNavController(navController)
            bottom_navigation?.setOnNavigationItemReselectedListener {
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