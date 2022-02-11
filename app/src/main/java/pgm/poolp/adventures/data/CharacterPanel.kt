package pgm.poolp.adventures.data
import androidx.compose.runtime.Immutable

@Immutable
data class CharacterPanel(
    val book: Int,
    val issue: Int,
    val page:Int,
    val panel:Int
)