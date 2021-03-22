package com.example.dimalearnsandroid

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val plusUseCase: PlusUseCase
) : ViewModel() {

    val dataSet = MutableLiveData<List<Int>>()

    fun loadSmth(first: Int, second: Int) {
        viewModelScope.launch(IO) {
            dataSet.postValue(List(second - first) { first + it })
        }
    }
}