package pgm.poolp.adventures.home

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.insets.statusBarsPadding
import kotlinx.coroutines.launch
import pgm.poolp.adventures.viewmodels.CharacterViewModel

//typealias OnExploreItemClicked = (ExploreModel) -> Unit

enum class CraneScreen {
    Fly, Sleep, Eat
}

@Composable
fun CraneHome(
    //onExploreItemClicked: OnExploreItemClicked,
    //onDateSelectionClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        modifier = Modifier.statusBarsPadding(),
        drawerContent = {
            CraneDrawer()
        }
    ) {
        val scope = rememberCoroutineScope()
        val characterViewModel: CharacterViewModel = hiltViewModel()
        CraneHomeContent(
            modifier = modifier,
            openDrawer = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            },
            viewModel = characterViewModel
        )
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CraneHomeContent(
    modifier: Modifier = Modifier,
    openDrawer: () -> Unit,
    viewModel: CharacterViewModel
) {
    val suggestedPanels by viewModel.allPanelsFromCharacter(3).observeAsState()

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
                            //onItemClicked = onExploreItemClicked
                        )
                    }
                }
                CraneScreen.Sleep -> {
                    suggestedPanels?.let { panels ->
                        ExploreSection(
                            title = "Explore Flights by Destination",
                            exploreList = panels
                            //onItemClicked = onExploreItemClicked
                        )
                    }
                }
                CraneScreen.Eat -> {
                    suggestedPanels?.let { panels ->
                        ExploreSection(
                            title = "Explore Flights by Destination",
                            exploreList = panels
                            //onItemClicked = onExploreItemClicked
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

data class FlySearchContentUpdates(
    val onPeopleChanged: (Int) -> Unit,
    val onToDestinationChanged: (String) -> Unit,
    val onDateSelectionClicked: () -> Unit
)

data class SleepSearchContentUpdates(
    val onPeopleChanged: (Int) -> Unit,
    val onDateSelectionClicked: () -> Unit
)

data class EatSearchContentUpdates(
    val onPeopleChanged: (Int) -> Unit,
    val onDateSelectionClicked: () -> Unit
)
