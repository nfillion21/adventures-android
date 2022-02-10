package pgm.poolp.adventures

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint
import pgm.poolp.adventures.ui.theme.AdventuresTheme
import pgm.poolp.adventures.viewmodels.CharacterViewModel
import pgm.poolp.adventures.viewmodels.IssueViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdventuresTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    val playerViewModel: CharacterViewModel by viewModels()
                    Greeting(
                        name ="Android",
                        viewModel = playerViewModel
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(
    name: String,
    viewModel: CharacterViewModel) {
    val elements by viewModel.allPanelsFromCharacter(3).observeAsState(listOf())
    Text(text = "Hello $elements!")
}

/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AdventuresTheme {
        Greeting("Android")
    }
}
*/