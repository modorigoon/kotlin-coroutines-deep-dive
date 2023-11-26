package me.modorigoon.ch6

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main() {
    runBlocking {
        delay(1000)
        println("World!")
    }
    runBlocking {
        delay(1000)
        println("World!")
    }
    runBlocking {
        delay(1000)
        println("World!")
    }
    runBlocking {
        delay(1000)
        println("World!")
    }
    print("Hello, ")
}
