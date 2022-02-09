package pgm.poolp.adventures.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface CharacterDAO {

    // The flow always holds/caches latest version of data. Notifies its observers when the
    // data has changed.
    @Query("select * from characters")
    fun getCharacters(): Flow<List<Character>>

    //@RawQuery(observedEntities = [Character::class])
    //LiveData<List<Character>> getCharacters(SupportSQLiteQuery query);

    // Usage of RawDao
    /*
    var liveSongs: LiveData<List<Song>> = rawDao.getSongs(
        SimpleSQLiteQuery("SELECT * FROM song ORDER BY name DESC")
    )
    */
}
