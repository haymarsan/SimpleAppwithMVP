package com.example.simpleappwithmvp.data.vos

import android.arch.persistence.room.Entity

@Entity(tableName = "inputName_table")
data class InputNameVO (

    val inputName: String

)