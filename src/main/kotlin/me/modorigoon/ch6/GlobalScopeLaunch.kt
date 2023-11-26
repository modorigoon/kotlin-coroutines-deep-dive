package me.modorigoon.ch6

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("Launch1")
    }
    GlobalScope.launch {
        delay(1000L)
        println("Launch2")
    }
    GlobalScope.launch {
        delay(1000L)
        println("Launch3")
    }
    GlobalScope.launch {
        delay(1000L)
        println("Launch4")
    }
    print("Hello, ")
    Thread.sleep(2000L)
}
