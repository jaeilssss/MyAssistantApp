package com.example.myassistantapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegisterPasswordViewModel : ViewModel() {
    // TODO: Implement the ViewModel


    var newPassword : MutableLiveData<String> = MutableLiveData("")

    var newPasswordSecond : MutableLiveData<String> = MutableLiveData("")

}