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

    @Query("select pan.number as panel, pag.number as page, i.number as issue, b.volume as book from characters_panels can_pan " +
            "inner join characters cha on can_pan.character_id = cha.id " +
            "inner join panels pan on can_pan.panel_id = pan.id " +
            "inner join pages pag on pan.page_id=pag.id " +
            "inner join issues i on pag.issue_id=i.id " +
            "inner join books b on i.book_id=b.id " +
            "where can_pan.character_id = :characterId"
    )
    fun getCharacterPanels(characterId:Int): Flow<List<CharacterPanel>>

    //@RawQuery(observedEntities = [Character::class])
    //LiveData<List<Character>> getCharacters(SupportSQLiteQuery query);

    // Usage of RawDao
    /*
    var liveSongs: LiveData<List<Song>> = rawDao.getSongs(
        SimpleSQLiteQuery("SELECT * FROM song ORDER BY name DESC")
    )
    */
}
