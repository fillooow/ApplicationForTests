package com.fillooow.applicationfortests

internal class UsingSomeClass{

    val iAmStuff = 1233132

    fun doStuff(): Int {

        val randomName = "$iAmStuff and I like this ${SomeClass().something}"
        return SomeClass().doSomethingPls().toInt()
    }
}