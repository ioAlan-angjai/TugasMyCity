package com.example.tugasmycity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.tugasmycity.navigation.JogjaGuideApp
import com.example.tugasmycity.ui.theme.TugasMyCityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasMyCityTheme {
                JogjaGuideApp()
            }
        }
    }
}
