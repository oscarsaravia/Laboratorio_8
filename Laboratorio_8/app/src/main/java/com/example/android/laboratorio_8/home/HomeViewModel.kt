package com.example.android.laboratorio_8.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private val _viewNews = MutableLiveData<Boolean>()
    val viewNews: LiveData<Boolean>
        get() = _viewNews

    fun viewNews(){
        _viewNews.value = true
    }

    fun viewNewsComplete(){
        _viewNews.value = false
    }
}
