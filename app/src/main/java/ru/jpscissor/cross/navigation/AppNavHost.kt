package ru.jpscissor.cross.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.jpscissor.cross.screens.HomescScreen
import ru.jpscissor.cross.screens.LogscScreen

sealed class NavRoute (val route: String) {
    object Logsc: NavRoute("log_screen")
    object Homesc: NavRoute("home_screen")
}

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = NavRoute.Logsc.route) {
        composable(NavRoute.Logsc.route){ LogscScreen(navController)}
        composable(NavRoute.Homesc.route){ HomescScreen(navController)}
    }

}
