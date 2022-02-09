package pgm.poolp.adventures.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "characters")
data class Character(
    @PrimaryKey (autoGenerate = false) val id: Int,
    val name: String
)