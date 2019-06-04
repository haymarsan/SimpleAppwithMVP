package com.example.simpleappwithmvp.data.persistence

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.simpleappwithmvp.data.vos.InputNameVO


@Database(entities = [InputNameVO::class], version = 1)
abstract class InputNameDB : RoomDatabase () {

    abstract val inputNameDao: InputNameDao

    companion object{

        private var DB_NAME = "inputName_DB"

        var inputNameDB: InputNameDB? = null

        fun getInstance(context: Context): InputNameDB{

            if (inputNameDB == null){
               inputNameDB = Room.databaseBuilder(context, InputNameDB::class.java, DB_NAME)
                   .allowMainThreadQueries()
                   .fallbackToDestructiveMigration()
                   .build()
            }
            return inputNameDB!!
        }


    }


}