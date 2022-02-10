package pgm.poolp.adventures.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface IssueDAO {

    // The flow always holds/caches latest version of data. Notifies its observers when the
    // data has changed.
    @Query("select * from issues")
    fun getIssues(): Flow<List<Issue>>
}
