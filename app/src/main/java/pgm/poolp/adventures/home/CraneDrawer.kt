package pgm.poolp.adventures.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.insets.navigationBarsPadding
import pgm.poolp.adventures.R
import pgm.poolp.adventures.viewmodels.CharacterViewModel

@Composable
fun CraneDrawer(modifier: Modifier,
                selectCharacter: (Int) -> Unit,
) {
    val characterViewModel: CharacterViewModel = hiltViewModel()
    val suggestedCharacters by characterViewModel.allCharacters.observeAsState()
    LazyColumn(
        modifier = modifier
            .padding(top = 48.dp)
            .navigationBarsPadding()
    ) {
        item {
            Image(
                modifier = Modifier.
                padding(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 8.dp),
                painter = painterResource(R.drawable.ic_crane_drawer),
                contentDescription = stringResource(R.string.cd_drawer)
            )

            Spacer(modifier = Modifier.height(16.dp))
        }


        suggestedCharacters?.let { characters ->
            items(characters) { character ->
                Text(
                    text = character.name,
                    style = MaterialTheme.typography.h5,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(onClick = {selectCharacter(character.id)})
                        //.padding(top = 12.dp, bottom = 12.dp)
                        .padding(
                            start = 16.dp,
                            top = 8.dp,
                            end = 16.dp,
                            bottom = 8.dp
                        )
                        .wrapContentWidth(Alignment.Start)
                )
            }
        }
    }
}

/*
@Preview
@Composable
fun CraneDrawerPreview() {
    AdventuresTheme {
        CraneDrawer()
    }
}
*/
