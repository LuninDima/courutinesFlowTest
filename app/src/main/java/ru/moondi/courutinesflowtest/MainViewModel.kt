package ru.moondi.courutinesflowtest

import androidx.lifecycle.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch

internal class MainViewModel(
     repository: Repository = Repository()
): ViewModel() {
    val liveData: LiveData<Data> = repository.userData.asLiveData()
  /*  val liveData: MutableLiveData<Data> = MutableLiveData()
    init{
        viewModelScope.launch {
            repository.userData.flowOn(Dispatchers.Main)
                .collect{data -> liveData.value = data}
        }
    }*/
}