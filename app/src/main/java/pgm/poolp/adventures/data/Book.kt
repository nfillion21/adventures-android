package pgm.poolp.adventures.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books")
data class Book(
    @PrimaryKey(autoGenerate = false) val id: Int,
    val volume: Int,
    val title: String
)