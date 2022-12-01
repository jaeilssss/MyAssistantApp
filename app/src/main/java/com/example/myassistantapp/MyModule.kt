package com.example.myassistantapp

import androidx.room.RoomDatabase
import com.example.myassistantapp.database.UserDatabase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
abstract class MyModule {

    @Binds
    abstract fun bindDatabase(database : UserDatabase) : UserDatabase


}