package edu.ucne.angel_morel_ap2_p2.presentation.tareas.list
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
//import dagger.hilt.android.lifecycle.HiltViewModel
//import edu.ucne.angel_morel_ap2_p2.data.remote.remotedatasource.Resource
//import edu.ucne.angel_morel_ap2_p2.domain.usecase.GetJugadoresUseCase
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.flow.asStateFlow
//import kotlinx.coroutines.flow.update
//import kotlinx.coroutines.launch
//import javax.inject.Inject
//@HiltViewModel
//class ListJugadoresViewModel @Inject constructor(
//    private val getJugadoresUseCase: GetJugadoresUseCase
//) : ViewModel() {
//    private val _state = MutableStateFlow(ListJugadoresUiState())
//    val state = _state.asStateFlow()
//
//    init {
//        loadJugadores()
//    }
//
//    fun onEvent(event: ListJugadoresUiEvent) {
//        when (event) {
//            is list.ListJugadoresUiEvent.UpdateFilterName -> {
//                _state.update {
//                    it.copy(filterName = event.nombres)
//                }
//            }
//            ListJugadoresUiEvent.Search -> loadJugadores()
//        }
//    }
//
//    private fun loadJugadores() {
//        viewModelScope.launch {
//            _state.update { it.copy(isLoading = true) }
//
//            val current = _state.value
//
//            val result = getJugadoresUseCase(
//                nombres = current.filterName.takeIf { it.isNotBlank() }
//            )
//
//            when (result) {
//                is Resource.Success ->
//                    _state.update {
//                        it.copy(
//                            isLoading = false,
//                            jugadores = result.data ?: emptyList()
//                        )
//                    }
//
//                is Resource.Error ->
//                    _state.update {
//                        it.copy(
//                            isLoading = false,
//                            error = result.message
//                        )
//                    }
//
//                is Resource.Loading -> _state.update { it.copy(isLoading = true) }
//            }
//        }
//    }
//}