package ui.mainlistpokemonscreen.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import data.models.listpokemon.RemoteListPokemon
import navigation.NavGo
import theme.DarkModeColors
import ui.mainlistpokemonscreen.MainListPokemonIntentHandler
import ui.mainlistpokemonscreen.components.ListPokemon
import ui.mainlistpokemonscreen.components.PagesButton

@Composable
fun MainListPokemonState(
    listPokemonItems: RemoteListPokemon,
    intentHandler: MainListPokemonIntentHandler,
    number: MutableState<Int>,
    navGo: NavGo,
    paddingValues: PaddingValues,
    colors: DarkModeColors
) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
    ) {
        ListPokemon(
            colors = colors,
            listPokemonItems = listPokemonItems,
            number = number,
            navGo = navGo
        )
        PagesButton(
            colors = colors,
            listPokemonItems = listPokemonItems,
            intentHandler = intentHandler,
            number = number
        )
    }
}