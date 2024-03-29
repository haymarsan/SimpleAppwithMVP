package com.example.simpleappwithmvp.persistence.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.simpleappwithmvp.data.vos.InputNameVO

@Dao
interface InputNameDao {

    @Query("SELECT * FROM inputName_table")
    fun getInputName():InputNameVO

    @Insert
    fun saveInputName(name: String): Long

}