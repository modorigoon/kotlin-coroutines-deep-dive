package me.modorigoon.ch3


import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine


private val executor = Executors.newSingleThreadScheduledExecutor {
    Thread(it, "scheduler").apply { isDaemon = true }
}

suspend fun delay(timeMillis: Long): Unit = suspendCoroutine { continuation ->
    executor.schedule({
        continuation.resume(Unit)
    }, timeMillis, TimeUnit.MILLISECONDS)
}

suspend fun main() {
    println("Before")

    suspendCoroutine { continuation ->
        executor.schedule({
            continuation.resume(Unit)
        }, 3000, TimeUnit.MILLISECONDS)
    }

    println("Step 1")

    delay(3000)

    println("Step 2")

    print("After")
}
