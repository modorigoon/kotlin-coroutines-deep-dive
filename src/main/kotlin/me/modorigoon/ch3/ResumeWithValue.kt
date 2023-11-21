package me.modorigoon.ch3

import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

suspend fun main() {
    val result: Int = suspendCoroutine<Int> { continuation ->
        continuation.resume(10)
    }
    println("result: $result")
}
