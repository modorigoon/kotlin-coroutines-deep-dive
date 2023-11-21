package me.modorigoon.ch3

import kotlin.concurrent.thread
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine


val counter = sequence {
    yield(5)
    yield(4)
    yield(3)
    yield(2)
    yield(1)
}

fun bombAfterSeconds(continuation: Continuation<Unit>) {
    thread {
        for (i in counter) {
            Thread.sleep(1000)
            println("COUNT: $i")
        }
        continuation.resume(Unit)
    }
}

suspend fun main() {
    println("START COUNT.")
    suspendCoroutine { continuation ->
        bombAfterSeconds(continuation)
    }
    println("BOMB!")
}
