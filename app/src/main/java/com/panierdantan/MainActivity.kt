package com.panierdantan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.ui.Modifier
import com.panierdantan.screens.HomePage
import com.panierdantan.ui.theme.PanierDAntanTheme
import io.realm.kotlin.mongodb.App
import io.realm.kotlin.mongodb.AppConfiguration

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val app = App.create("panierantan-fquok")

            AppConfiguration.Builder(app.configuration.appId)
                .appName(R.string.app_name.toString())
                .appVersion("1.0.0")
                .build()

            val windowSizeClass = calculateWindowSizeClass(this)
            PanierDAntanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomePage()
                }
            }
        }
    }
}