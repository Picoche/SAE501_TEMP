package com.panierdantan.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


import com.panierdantan.Destination
import com.panierdantan.R
import com.panierdantan.screens.shops.MesBoutiques
import com.panierdantan.screens.shops.MesFavoris
import com.panierdantan.screens.shops.MonPanier
import com.panierdantan.screens.shops.MonProfil


val unboundedFamily = FontFamily(
    Font(R.font.unbounded_light, FontWeight.Light),
    Font(R.font.unbounded_regular, FontWeight.Normal),
    Font(R.font.unbounded_medium, FontWeight.Medium),
    Font(R.font.unbounded_bold, FontWeight.Bold)
)

@Composable
fun HomePage() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    val destinations = listOf(
        Destination.VueBoutiques,
        Destination.VuePanier,
        Destination.VueFavoris,
        Destination.VueProfil
    )
    Scaffold(
        bottomBar = {
            // if (currentDestination?.route != Destination.Profil.destination)
            BottomNavigation(
                Modifier
                    .navigationBarsPadding()
                    .background(SolidColor(Color(0xFF336699))),
                backgroundColor = Color.Transparent,
                contentColor = Color.White,
                elevation = 0.dp,
            ) {
                destinations.forEach { screen ->
                    BottomNavigationItem(
                        selected =
                        currentDestination?.hierarchy?.any { it.route == screen.destination } == true,
                        selectedContentColor = Color(0xFFFF9914),
                        unselectedContentColor = Color.White,
                        icon = { Icon(screen.icon, contentDescription = null) },
                        onClick = { navController.navigate(screen.destination) })
                }
            }
        }) { innerPadding ->
        NavHost(
            navController, startDestination = Destination.VueBoutiques.destination,
            Modifier.padding(innerPadding)
        ) {
            composable("vue_boutiques") {
                MesBoutiques()
            }
            composable("vue_panier") { MonPanier() }
            composable("vue_favoris") { MesFavoris() }
            composable("vue_profil") { MonProfil() }
        }
    }
}