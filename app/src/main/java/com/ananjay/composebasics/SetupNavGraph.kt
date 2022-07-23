package com.ananjay.composebasics

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navController)
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument(KEY){
                type = NavType.IntType
            })
        ){
            Log.d("Args", "${it.arguments?.getInt(KEY)} ")
            DetailedScreen(navController)
        }
    }
}