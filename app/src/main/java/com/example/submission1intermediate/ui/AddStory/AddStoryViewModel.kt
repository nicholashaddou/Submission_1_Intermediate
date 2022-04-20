package com.example.submission1intermediate.ui.AddStory

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.submission1intermediate.data.UserModel
import com.example.submission1intermediate.data.preference.UserPreference

class AddStoryViewModel(private val pref: UserPreference) : ViewModel(){
    fun getUser(): LiveData<UserModel> {
        return pref.getUser().asLiveData()
    }
}