package com.example.blechat

import android.view.View

/**
 * Created by Ajay Vamsee on 7/21/2023.
 * Time : 19:14
 */
fun View.visible(){
    this.visibility = View.VISIBLE
}

fun View.gone(){
    this.visibility = View.GONE
}

val <T> T.exhaustive:T
    get() = this