package com.example.myassistantapp.dto

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class User(@PrimaryKey val password : String , val signedBy : String) {



}