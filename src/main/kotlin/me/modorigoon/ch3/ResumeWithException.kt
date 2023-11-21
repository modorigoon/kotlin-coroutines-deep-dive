package me.modorigoon.ch3

import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

class JustException : Throwable("Just an exception.")

suspend fun main() {
    try {
        suspendCoroutine<Unit> { continuation ->
            continuation.resumeWithException(JustException())
        }
    } catch (e: JustException) {
        println("error: ${e.message}")
    }
}
