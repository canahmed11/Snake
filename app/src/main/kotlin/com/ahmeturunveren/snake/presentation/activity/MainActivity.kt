package com.ahmeturunveren.snake.presentation.activity

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahmeturunveren.snake.domain.base.BaseActivity
import com.ahmeturunveren.snake.domain.navigation.Screen
import com.ahmeturunveren.snake.presentation.screen.AboutScreen
import com.ahmeturunveren.snake.presentation.screen.HighScoreScreen
import com.ahmeturunveren.snake.presentation.screen.MenuScreen
import com.ahmeturunveren.snake.presentation.screen.SettingScreen

class MainActivity : BaseActivity() {
    private lateinit var navController: NavHostController

    @Composable
    override fun Content() {
        navController = rememberNavController()
        SetupNavigation()
    }

    @Composable
    private fun SetupNavigation() {
        NavHost(navController = navController, startDestination = Screen.Menu.route) {
            composable(Screen.Menu.route) { MenuScreen(navController) }
            composable(Screen.HighScores.route) { HighScoreScreen(navController) }
            composable(Screen.Settings.route) { SettingScreen(navController) }
            composable(Screen.About.route) { AboutScreen(navController) }
        }
    }
}
