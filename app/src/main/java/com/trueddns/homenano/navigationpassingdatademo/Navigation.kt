package com.trueddns.homenano.navigationpassingdatademo

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.gson.Gson

@Composable
fun Navigation(users: List<User>) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "usersView"
    ) {

        composable("usersView") {
            UsersView(navController = navController, users = users)
        }

        composable(
            "userDetailsView/{user}",
            arguments = listOf(
                navArgument("user") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->

            backStackEntry?.arguments?.getString("user")?.let { json ->
                val user = Gson().fromJson(json, User::class.java)
                UserDetailsView(user = user)
            }

        }
        
    }
}