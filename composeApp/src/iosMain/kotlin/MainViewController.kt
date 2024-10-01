import androidx.compose.ui.window.ComposeUIViewController
import CrossConfigDevice as ConfigDevice1
import org.koin.core.context.startKoin
import ui.di.AppModule

fun MainViewController() = ComposeUIViewController { App(ConfigDevice1()) }

fun initKoin(){
    startKoin {
        modules(AppModule())
    }.koin
}