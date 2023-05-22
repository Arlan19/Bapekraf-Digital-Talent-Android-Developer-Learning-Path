package com.allacsta.recycleviewexcercise

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String, val username: String, val avatar: Int, val repo: String
): Parcelable
