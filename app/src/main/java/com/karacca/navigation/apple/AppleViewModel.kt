package com.karacca.navigation.apple

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @user: omer.karaca
 * @date: 2020-01-21
 */

class AppleViewModel : ViewModel() {

    private val _count = MutableLiveData(0)
    val count: LiveData<Int>
        get() = _count

    fun increment() {
        _count.postValue((_count.value ?: 0) + 1)
    }

    fun decrement() {
        _count.postValue((_count.value ?: 0) - 1)
    }
}