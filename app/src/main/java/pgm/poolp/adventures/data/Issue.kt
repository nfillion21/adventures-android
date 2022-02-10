package pgm.poolp.adventures.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "issues")
data class Issue(
    @PrimaryKey(autoGenerate = false) val id: Int,
    @ColumnInfo(name = "book_id") val bookId: Int,
    val title: String,
    val number: Int
)