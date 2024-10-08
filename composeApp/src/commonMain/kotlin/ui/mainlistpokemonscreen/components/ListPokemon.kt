package ui.mainlistpokemonscreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.models.listpokemon.RemoteListPokemon
import navigation.NavGo
import theme.DarkModeColors

@Composable
fun ListPokemon(
    listPokemonItems: RemoteListPokemon,
    number: MutableState<Int>,
    navGo: NavGo,
    colors: DarkModeColors
) {
    val lazyListState = rememberLazyListState()
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.92f),
        colors = CardDefaults.cardColors(containerColor = colors.background)
    ) {
        TextHeadDescription(
            colors = colors,
            listPokemonItems = listPokemonItems,
            number = number
        )
        LazyColumn(
            modifier = Modifier.background(colors.background)
                .padding(6.dp),
            state = lazyListState
        ) {
            listPokemonItems.results?.let { pokemonList ->
                items(pokemonList.size) { index ->
                    val pokemon = pokemonList[index]
                    pokemon?.let { remotePokemon ->
                        ListSelectItem(
                            colors = colors,
                            name = remotePokemon.name.toString(),
                            onClick = {
                                navGo.logDetailPokemon.invoke(
                                    remotePokemon.name.toString()
                                )
                            }
                        )
                    }
                }
            }
        }
    }
}
