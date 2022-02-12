/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pgm.poolp.adventures.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.navigationBarsPadding
import pgm.poolp.adventures.R
import pgm.poolp.adventures.ui.AdventuresTheme

private val screens = listOf("Michaelangelo", "My Trips", "Saved Trips", "Price Alerts", "My Account","Find Trips", "My Trips", "Saved Trips", "Price Alerts", "My Account","Find Trips", "My Trips", "Saved Trips", "Price Alerts", "My Account","Find Trips", "My Trips", "Saved Trips", "Price Alerts", "My Account")

@Composable
fun CraneDrawer(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .padding(start = 24.dp, top = 48.dp)
            .navigationBarsPadding()
    ) {
        item {
            Image(
                painter = painterResource(R.drawable.ic_crane_drawer),
                contentDescription = stringResource(R.string.cd_drawer)
            )

            Spacer(modifier = Modifier.height(16.dp))
        }
        items(screens) { screen ->
            Text(
                modifier = Modifier.padding(top = 12.dp, bottom = 12.dp),
                text = screen,
                style = MaterialTheme.typography.h5,
            )
        }
    }
}

@Preview
@Composable
fun CraneDrawerPreview() {
    AdventuresTheme {
        CraneDrawer()
    }
}
