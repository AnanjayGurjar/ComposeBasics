package com.ananjay.composebasics

const val KEY = "id"
sealed class Screen(var route: String){
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen/{$KEY}")
}
