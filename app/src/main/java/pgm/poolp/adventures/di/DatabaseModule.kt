package pgm.poolp.adventures.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import pgm.poolp.adventures.data.AdventuresRoomDatabase
import pgm.poolp.adventures.data.CharacterDAO
import pgm.poolp.adventures.data.IssueDAO
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AdventuresRoomDatabase {
        return AdventuresRoomDatabase.getInstance(context)
    }

    @Provides
    fun provideCharacterDao(appDatabase: AdventuresRoomDatabase): CharacterDAO {
        return appDatabase.characterDao()
    }

    @Provides
    fun provideIssueDao(appDatabase: AdventuresRoomDatabase): IssueDAO {
        return appDatabase.issueDao()
    }
}
