package pgm.poolp.adventures.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class IssueRepository @Inject constructor(private val issueDAO: IssueDAO) {

    // Room executes all queries on a separate thread.
    // Observed Flow will notify the observer when the data has changed.
    val allIssues: Flow<List<Issue>> = issueDAO.getIssues()
    //fun allPanelsFromCharacter(characterId:Int) = characterDao.getCharacterPanels(characterId)
}
