package com.example.myassistantapp.ui

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.room.RoomDatabase
import com.example.myassistantapp.database.UserDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject



class MainViewModel : ViewModel() {


    var password : MutableLiveData<String> = MutableLiveData("")





//    fun login() : Boolean {
//
//        return UserDatabase.getInstance()
//
//    }
}