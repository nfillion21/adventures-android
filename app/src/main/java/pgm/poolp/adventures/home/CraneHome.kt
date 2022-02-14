package pgm.poolp.adventures.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import com.google.accompanist.insets.statusBarsPadding
import kotlinx.coroutines.launch
import pgm.poolp.adventures.R
import pgm.poolp.adventures.data.CharacterPanel
import pgm.poolp.adventures.viewmodels.CharacterViewModel

//typealias OnCharacterPanelClicked = (CharacterPanel) -> Unit

enum class CraneScreen {
    Fly, Sleep, Eat
}

@Composable
fun CraneHome(
    modifier: Modifier = Modifier
) {
    val scaffoldState = rememberScaffoldState()
    var mutableCharacterId by remember { mutableStateOf(-1)}
    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        modifier = Modifier.statusBarsPadding(),
        drawerContent = {
            CraneDrawer(
                modifier = modifier,
                selectCharacter = {
                    mutableCharacterId = it
                    scope.launch {
                        scaffoldState.drawerState.close()
                    }
                }
            )
        }
    ) {
        CraneHomeContent(
            modifier = modifier,
            openDrawer = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            },
            characterId = mutableCharacterId
        )
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CraneHomeContent(
    modifier: Modifier = Modifier,
    openDrawer: () -> Unit,
    characterId: Int
) {

    val characterViewModel: CharacterViewModel = hiltViewModel()
    val suggestedPanels by characterViewModel.allPanelsFromCharacter(characterId).observeAsState()

    //val onPeopleChanged: (Int) -> Unit = { viewModel.updatePeople(it) }
    var tabSelected by remember { mutableStateOf(CraneScreen.Fly) }

    BackdropScaffold(
        modifier = modifier,
        scaffoldState = rememberBackdropScaffoldState(BackdropValue.Revealed),
        frontLayerScrimColor = Color.Unspecified,
        appBar = {
            HomeTabBar(openDrawer, tabSelected, onTabSelected = { tabSelected = it })
        },
        backLayerContent = {
            SearchContent(
                tabSelected
                //onPeopleChanged
                //onDateSelectionClicked,
                //onExploreItemClicked
            )
        },
        frontLayerContent = {
            when (tabSelected) {
                CraneScreen.Fly -> {
                    suggestedPanels?.let { panels ->
                        ExploreSection(
                            title = "Explore Flights by Destination",
                            exploreList = panels
                        )
                    }
                }
                CraneScreen.Sleep -> {
                    suggestedPanels?.let { panels ->
                        ExploreSection(
                            title = "Explore Flights by Destination",
                            exploreList = panels
                        )
                    }
                }
                CraneScreen.Eat -> {
                    suggestedPanels?.let { panels ->
                        ExploreSection(
                            title = "Explore Flights by Destination",
                            exploreList = panels
                        )
                    }
                }
            }
        }
    )
}

@Composable
private fun HomeTabBar(
    openDrawer: () -> Unit,
    tabSelected: CraneScreen,
    onTabSelected: (CraneScreen) -> Unit,
    modifier: Modifier = Modifier
) {
    CraneTabBar(
        modifier = modifier,
        onMenuClicked = openDrawer
    ) { tabBarModifier ->
        CraneTabs(
            modifier = tabBarModifier,
            titles = CraneScreen.values().map { it.name },
            tabSelected = tabSelected,
            onTabSelected = { newTab -> onTabSelected(CraneScreen.values()[newTab.ordinal]) }
        )
    }
}

@Composable
private fun SearchContent(
    tabSelected: CraneScreen
    //onPeopleChanged: (Int) -> Unit,
    //onDateSelectionClicked: () -> Unit
    //onExploreItemClicked: OnExploreItemClicked
) {
    // Reading datesSelected State from here instead of passing the String from the ViewModel
    // to cause a recomposition when the dates change.
    //val datesSelected = viewModel.datesSelected.toString()

    when (tabSelected) {
        CraneScreen.Fly ->
            Spacer(Modifier.height(8.dp))

        CraneScreen.Sleep ->
            Spacer(Modifier.height(8.dp))

        CraneScreen.Eat ->
            Spacer(Modifier.height(8.dp))

    }

}
