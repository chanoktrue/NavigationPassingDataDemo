package com.trueddns.homenano.navigationpassingdatademo


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.navArgument
import com.google.gson.Gson

@Composable
fun UsersView(navController: NavController ,users: List<User>) {

    fun navigationToUser(user: User) {
        val userJson = Gson().toJson(user)
        navController.navigate("userDetailsView/$userJson")
    }


    LazyColumn{
        items(users) { user ->

            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
                    .clickable {
                        navigationToUser(user)
                    }
            ) {
                Text(
                    text = user.name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(18.dp)
                )
            }
        }
    }
}