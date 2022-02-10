package pgm.poolp.adventures.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import pgm.poolp.adventures.data.CharacterRepository
import pgm.poolp.adventures.data.Character
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject internal constructor(
    private val characterRepository: CharacterRepository,
) : ViewModel()
{
    val allCharacters: LiveData<List<Character>> = characterRepository.allCharacters.asLiveData()
    val allPanelsFromCharacter: LiveData<List<Character>> = characterRepository.allPanelsFromCharacter.asLiveData()
}