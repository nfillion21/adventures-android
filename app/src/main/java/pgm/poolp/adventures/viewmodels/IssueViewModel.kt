package pgm.poolp.adventures.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import pgm.poolp.adventures.data.Issue
import pgm.poolp.adventures.data.IssueRepository
import javax.inject.Inject

@HiltViewModel
class IssueViewModel @Inject internal constructor(
    private val issueRepository: IssueRepository,
) : ViewModel()
{
    val allIssues: LiveData<List<Issue>> = issueRepository.allIssues.asLiveData()
    //val allPanelsFromCharacter: LiveData<List<Character>> = characterRepository.allPanelsFromCharacter.asLiveData()
}