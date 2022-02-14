package pgm.poolp.adventures.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter.State.Loading
import coil.compose.rememberImagePainter
import com.google.accompanist.insets.navigationBarsHeight
import pgm.poolp.adventures.R
import pgm.poolp.adventures.data.CharacterPanel
import pgm.poolp.adventures.ui.BottomSheetShape
import pgm.poolp.adventures.ui.crane_caption
import pgm.poolp.adventures.ui.crane_divider_color

@Composable
fun ExploreSection(
    modifier: Modifier = Modifier,
    title: String,
    exploreList: List<CharacterPanel>
    //onItemClicked: OnExploreItemClicked
) {
    Surface(modifier = modifier.fillMaxSize(), color = Color.White, shape = BottomSheetShape) {
        Column(modifier = Modifier.padding(start = 24.dp, top = 20.dp, end = 24.dp)) {
            Text(
                text = title,
                style = MaterialTheme.typography.caption.copy(color = crane_caption)
            )
            Spacer(Modifier.height(8.dp))
            LazyColumn(
                modifier = Modifier.weight(1f),
            ) {
                items(exploreList) { exploreItem ->
                    Column(Modifier.fillParentMaxWidth()) {
                        ExploreItem(
                            modifier = Modifier.fillParentMaxWidth(),
                            item = exploreItem
                            //onItemClicked = onItemClicked
                        )
                        Divider(color = crane_divider_color)
                    }
                }
                item {
                    Spacer(modifier = Modifier.navigationBarsHeight())
                }
            }
        }
    }
}

@OptIn(ExperimentalCoilApi::class)
@Composable
private fun ExploreItem(
    modifier: Modifier = Modifier,
    item: CharacterPanel
    //onItemClicked: OnExploreItemClicked
) {
    Row(
        modifier = modifier
            .clickable { /*onItemClicked(item)*/ }
            .padding(top = 12.dp, bottom = 12.dp)
    ) {
        ExploreImageContainer {
            Box {
                val painter = rememberImagePainter(
                    //data = item.imageUrl,
                    //val str = item.book.to
                    data = "https://www.ug-data.xyz/adventures/" +
                            String.format("%02d", item.book) + "_" +
                            String.format("%02d", item.issue) + "_" +
                            String.format("%02d", item.page) + "_" +
                            String.format("%02d", item.panel),
                    builder = {
                        crossfade(true)
                    }
                )
                Image(
                    painter = painter,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize(),
                )

                if (painter.state is Loading) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_crane_logo),
                        contentDescription = null,
                        modifier = Modifier
                            .size(36.dp)
                            .align(Alignment.Center),
                    )
                }
            }
        }
        Spacer(Modifier.width(24.dp))
        Column {
            Text(
                //text = item.city.nameToDisplay,
                text = "Book " + String.format("%02d", item.book) + "/16",
                style = MaterialTheme.typography.h6
            )
            Spacer(Modifier.height(8.dp))
            Text(
                //text = item.description,
                //text = item.issue.toString(),
                text = "Issue #" + String.format("%02d", item.issue) + ", " +
                        "Page #" + String.format("%02d", item.page) + ", " +
                        "Panel #" + String.format("%02d", item.panel),
                style = MaterialTheme.typography.caption.copy(color = crane_caption)
            )
        }
    }
}

@Composable
private fun ExploreImageContainer(content: @Composable () -> Unit) {
    Surface(Modifier.size(width = 60.dp, height = 60.dp), RoundedCornerShape(4.dp)) {
        content()
    }
}
