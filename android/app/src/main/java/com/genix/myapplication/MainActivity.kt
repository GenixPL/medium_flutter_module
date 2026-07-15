package com.genix.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.flutter.embedding.android.FlutterActivity

// TODO(genix): passing data around
// TODO(genix): multiple modules (umbrella pattern)
// TODO(genix): activity
// TODO(genix): fragment
// TODO(genix): navigation
// TODO(genix): build aar vs compile directly
// TODO(genix): freeing up resources
// TODO(genix): investigate: To avoid Dex merging issues, flutter.androidPackage should not be identical to your host app's package name.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme(colorScheme = darkColorScheme()) {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {

                        Button(
                            onClick = ::startFlutterActivity,
                        ) {
                            Text("flutter activity")
                        }

                        Text("2")
                    }
                }
            }
        }
    }

    fun startFlutterActivity() {
        startActivity(
            FlutterActivity.createDefaultIntent(this)
        )
    }
}
