package ui.mainlistpokemon

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import navigation.NavGo
import theme.DarkModeColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainListPokemonScreen(
    navGo: NavGo,
    colors: DarkModeColors
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                backgroundColor = colors.background,
                title = {
                    Text(
                        text = "DashBoard",
                        fontSize = 25.sp,
                        color = colors.textColor
                    )
                },
                navigationIcon = {
                    Icon(
                        modifier = Modifier.padding(10.dp),
                        imageVector = Icons.Filled.Apps,
                        contentDescription = "Menu",
                        tint = colors.textColor
                    )
                },
                elevation = 0.dp,
            )
        },
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "No hay mas expensas, agregue algunas por favor",
            )
        }
    }
}
