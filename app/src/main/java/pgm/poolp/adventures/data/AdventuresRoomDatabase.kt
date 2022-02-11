package pgm.poolp.adventures.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [
    Character::class,
    Book::class,
    Issue::class,
    Page::class,
    Panel::class,
    CharacterPanelCrossRef::class],
    version = 1, exportSchema = false)
abstract class AdventuresRoomDatabase : RoomDatabase() {

    abstract fun characterDao(): CharacterDAO

    companion object {
        @Volatile
        private var instance: AdventuresRoomDatabase? = null

        private const val DATABASE_NAME = "adventures-db"

        fun getInstance(context: Context): AdventuresRoomDatabase {
            return instance ?: synchronized(this)
            {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): AdventuresRoomDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                AdventuresRoomDatabase::class.java,
                DATABASE_NAME
            )
                // Wipes and rebuilds instead of migrating if no Migration object.
                // Migration is not part of this codelab.
                .fallbackToDestructiveMigration()
                .createFromAsset("database/adventures.db")
                //.addCallback(HeroesDatabaseCallback(context))
                .build()
        }
    }
}