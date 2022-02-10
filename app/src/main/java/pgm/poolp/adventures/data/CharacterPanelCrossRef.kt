package pgm.poolp.adventures.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "characters_panels", primaryKeys = ["character_id", "panel_id"])
data class CharacterPanelCrossRef(
    @ColumnInfo(name = "character_id") val characterId: Int,
    @ColumnInfo(name = "panel_id") val panelId: Int
)