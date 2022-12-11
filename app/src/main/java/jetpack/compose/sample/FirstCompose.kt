package jetpack.compose.sample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class FirstCompose {

    @Composable
    fun CardExample() {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Dhananjay Mohnot")
            Text(text = "SDE-2")
            Text(text = "Mobile App Dev")
        }
    }

    @Preview
    @Composable
    fun CardExamplePreview() {
        CardExample()
    }
}