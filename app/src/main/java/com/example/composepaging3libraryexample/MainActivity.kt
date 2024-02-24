package com.example.composepaging3libraryexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.composepaging3libraryexample.presentation.BeerScreen
import com.example.composepaging3libraryexample.presentation.BeerViewModel
import com.example.composepaging3libraryexample.ui.theme.ComposePaging3LibraryExampleTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePaging3LibraryExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewmodel = hiltViewModel<BeerViewModel>()
                    val beers = viewmodel.beerPagingFlow.collectAsLazyPagingItems()
                    BeerScreen(
                        beers = beers
                    )
                }
            }
        }
    }
}
