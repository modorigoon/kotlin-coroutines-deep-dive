package me.modorigoon.ch6

import kotlin.concurrent.thread


fun main() {
    thread(isDaemon = true) {
        Thread.sleep(1000)
        println("Thread1")
    }
    thread(isDaemon = true) {
        Thread.sleep(1000)
        println("Thread2")
    }
    thread(isDaemon = true) {
        Thread.sleep(1000)
        println("Thread3")
    }
    thread(isDaemon = true) {
        Thread.sleep(1000)
        println("Thread4")
    }
    print("Hello, ")
    Thread.sleep(2000)
}
