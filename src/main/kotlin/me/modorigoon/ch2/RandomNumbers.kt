package me.modorigoon.ch2

import java.util.Random


fun randomNumbers(seed: Long = System.currentTimeMillis()): Sequence<Int> = sequence {
    val random = Random(seed)
    while (true) {
        yield(random.nextInt())
    }
}

fun randomUniqueStrings(length: Int, seed: Long = System.currentTimeMillis()): Sequence<String> = sequence {
    val random = Random(seed)
    val charPool = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    while (true) {
        val randomString = (1..length)
            .map { _ -> random.nextInt(charPool.size) }
            .map(charPool::get)
            .joinToString("")
        yield(randomString)
    }
}.distinct()

fun main() {
    val randomNumber = randomNumbers().take(10).toList()
    println("random number: $randomNumber")
}
