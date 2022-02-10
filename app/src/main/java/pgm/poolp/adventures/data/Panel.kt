package pgm.poolp.adventures.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "panels")
data class Panel(
    @PrimaryKey(autoGenerate = false) val id: Int,
    @ColumnInfo(name = "page_id") val pageId: Int,
    val number: Int
)