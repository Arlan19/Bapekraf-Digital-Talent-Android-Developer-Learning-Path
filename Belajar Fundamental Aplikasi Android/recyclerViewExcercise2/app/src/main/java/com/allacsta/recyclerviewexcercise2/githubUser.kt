package com.allacsta.recyclerviewexcercise2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class githubUser (
    val name : String, val username: String, val avatar: Int
    ):Parcelable