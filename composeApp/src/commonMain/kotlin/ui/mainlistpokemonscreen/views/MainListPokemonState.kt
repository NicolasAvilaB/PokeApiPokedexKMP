package ui.mainlistpokemonscreen.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import data.models.listpokemon.RemoteListPokemon
import navigation.NavGo
import ui.mainlistpokemonscreen.MainListPokemonIntentHandler
import ui.mainlistpokemonscreen.components.ListPokemon
import ui.mainlistpokemonscreen.components.PagesButton

@Composable
fun MainListPokemonState(
    listPokemonItems: RemoteListPokemon,
    intentHandler: MainListPokemonIntentHandler,
    number: MutableState<Int>,
    navGo: NavGo,
    paddingValues: PaddingValues
) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
    ) {
        ListPokemon(
            listPokemonItems = listPokemonItems,
            number = number,
            navGo = navGo
        )
        PagesButton(
            listPokemonItems = listPokemonItems,
            intentHandler = intentHandler,
            number = number
        )
    }
}