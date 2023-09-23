package com.devdroid.horoscopapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.devdroid.horoscopapp.R
import com.devdroid.horoscopapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController//Crar una variable para almacenar la navegación




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()

    }
    //Este metodo llama a pequeños metodos que inicializan la navegación
    private fun initUi(){
        iniNavigation()
    }

    private fun iniNavigation() {
        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment// Esta variable se llena con el fragment llamandolo con el id y posterior en el as le decimos que lo castee a NavHostFragment
        navController = navHost.navController //En esta variable lo que hacemos es que a nuestra variable antes creada NavController se le asigne el navHost
        binding.bottomNavView.setupWithNavController(navController)//En esta parte loque hacemos es que el binding llame a nuestroButtomNavigation y que configure la navegacion es decir que cada vez que se mueva se mueva junto con el fragmentbhn
    }
}