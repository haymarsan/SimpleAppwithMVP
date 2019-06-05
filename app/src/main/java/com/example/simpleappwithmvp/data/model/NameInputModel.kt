package com.example.simpleappwithmvp.data.model

import android.content.Context
import com.example.simpleappwithmvp.data.vos.InputNameVO
import com.example.simpleappwithmvp.persistence.InputNameDB

object NameInputModel:BaseModel(), INameInputModel {


    lateinit var mInputNameDB: InputNameDB

    fun initModel(context: Context){
        mInputNameDB = InputNameDB.getInstance(context)
    }


    fun getInstance(): NameInputModel
    {
        return NameInputModel
    }


    override fun getInputName(): InputNameVO {
       return mInputNameDB.inputNameDao.getInputName()
    }

    override fun insertInputName(name: String) {
        mInputNameDB.inputNameDao.saveInputName(name)
    }



}