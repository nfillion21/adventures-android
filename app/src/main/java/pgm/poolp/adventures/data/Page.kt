package pgm.poolp.adventures.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pages")
data class Page(
    @PrimaryKey(autoGenerate = false) val id: Int,
    @ColumnInfo(name = "issue_id") val issueId: Int,
    val number: Int
)