package com.example.android.laboratorio_8.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.laboratorio_8.network.HackerNew
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

class NewsViewModel : ViewModel() {

    private val _githubRepos = MutableLiveData<List<HackerNew>>()
    val githubRepos: LiveData<List<HackerNew>>
        get() = _githubRepos

    private val _status = MutableLiveData<GithubApiStatus>()
    val status: LiveData<GithubApiStatus>
        get() = _status

    private val _currentGithubRepo = MutableLiveData<GithubRepo>()
    val currentGithubRepo: LiveData<GithubRepo>
        get() = _currentGithubRepo

    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    init {
        startStatus()
        getRepos()
    }

}
