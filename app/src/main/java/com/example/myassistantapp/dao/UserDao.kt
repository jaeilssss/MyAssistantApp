package com.example.myassistantapp.dao

import androidx.room.*
import com.example.myassistantapp.dto.User


@Dao
interface UserDao {

    @Insert
    fun insert(user: User)

    @Update
    fun update(user: User)

    @Delete
    fun delete(user: User)


    @Query("SELECT * FROM USER WHERE password = :password") // 'name'에 해당하는 유저를 삭제해라
    fun findUserByPassword(password: String) : User


}
