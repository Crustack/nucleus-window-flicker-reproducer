import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.rememberWindowState
import dev.nucleusframework.application.nucleusApplication
import dev.nucleusframework.window.material.MaterialDecoratedWindow
import dev.nucleusframework.window.material.MaterialTitleBar

fun main(args: Array<String>) = nucleusApplication(args) {
    MaterialTheme(colorScheme = darkColorScheme()) {
        MaterialDecoratedWindow(
            onCloseRequest = ::exitApplication,
            title = "Tao X11 Focus Flicker Repro",
            state = rememberWindowState(
                size = DpSize(800.dp, 600.dp),
                position = WindowPosition.Aligned(Alignment.Center),
            ),
        ) {
            MaterialTitleBar {
                Text("Tao X11 Focus Flicker Repro", modifier = Modifier.align(Alignment.Start))
            }
            Box(
                modifier = Modifier.fillMaxSize().background(Color(0xFF1E1E2E)),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = "Click another window, then click back here.",
                    color = Color.White,
                )
            }
        }
    }
}
