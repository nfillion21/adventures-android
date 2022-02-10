package pgm.poolp.adventures.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import androidx.room.RawQuery
import kotlinx.coroutines.flow.Flow

@Dao
interface PanelDAO {

    // The flow always holds/caches latest version of data. Notifies its observers when the
    // data has changed.
    /*
    @Query("select * from characters")
    fun getCharacters(): Flow<List<Character>>

    @Query(
        "SELECT user.name AS userName, book.name AS bookName " +
                "FROM user, book " +
                "WHERE user.id = book.user_id"
    )
    fun loadUserAndBookNames(): LiveData<List<UserBook>>
    */
    /*
    @Query(
        "SELECT characters.name AS userName, book.name AS bookName " +
                "FROM user, book " +
                "WHERE user.id = book.user_id"
    )
    */

    /*
    @Query("select panels.number panel, pag.number page, i.number issue, b.volume book from characters_panels can_pan" +
                "inner join characters cha on can_pan.character_id = cha.id" +
                "inner join panels pan on can_pan.panel_id = pan.id" +
                "inner join pages pag on pan.page_id=pag.id" +
                "inner join issues i on pag.issue_id=i.id" +
                "inner join books b on i.book_id=b.id" +
                "where can_pan.character_id = 3"
            )
    fun getCharacters(): Flow<List<CharacterPanel>>


    // You can also define this class in a separate file.
     */
}
