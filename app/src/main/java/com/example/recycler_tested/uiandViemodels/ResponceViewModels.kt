package com.example.jetpack_recycler.uiandViewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpack_recycler.data.HarryResponceItem
import com.example.jetpack_recycler.newtork.HarryResponce
import com.example.jetpack_recycler.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class ResponceViewModels @Inject constructor(repository: Repository):ViewModel() {
    private val state = MutableStateFlow(emptyList<HarryResponceItem>())
    var stateFlow:StateFlow<List<HarryResponceItem>> = state
    init {

        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val take = repository.gets()
                state.value  = take
            }
        }
    }
}