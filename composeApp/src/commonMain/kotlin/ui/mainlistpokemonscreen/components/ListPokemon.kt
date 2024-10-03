package ui.mainlistpokemonscreen.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.models.listpokemon.RemoteListPokemon
import navigation.NavGo

@Composable
fun ListPokemon(
    listPokemonItems: RemoteListPokemon,
    number: MutableState<Int>,
    navGo: NavGo
) {
    val lazyListState = rememberLazyListState()
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp)
            .fillMaxHeight(0.92f)
    ) {
        TextHeadDescription(
            listPokemonItems = listPokemonItems,
            number = number
        )
        LazyColumn(
            state = lazyListState
        ) {
            listPokemonItems.results?.let { pokemonList ->
                items(pokemonList.size) { index ->
                    val pokemon = pokemonList[index]
                    pokemon?.let { remotePokemon ->
                        ListSelectItem(
                            name = remotePokemon.name.toString(),
                            onClick = {
                            }
                        )
                    }
                }
            }
        }
    }
}