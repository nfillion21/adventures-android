package pgm.poolp.adventures.data

import androidx.room.*

data class CharacterWithPanels(
    @Embedded val character: Character,
    @Relation(
        parentColumn = "characterId",
        entityColumn = "panelId",
        associateBy = Junction(CharacterPanelCrossRef::class)
    )
    val panels: List<Panel>
)
