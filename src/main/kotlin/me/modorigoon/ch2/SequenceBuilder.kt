package me.modorigoon.ch2

val seq = sequence {
    println("Generating 1")
    yield(1)
    println("Generating 2")
    yield(2)
    println("Generating 3")
    yield(3)
    println("Done")
}

fun main() {
    for (i in seq) {
        println("-- $i --")
    }
}
