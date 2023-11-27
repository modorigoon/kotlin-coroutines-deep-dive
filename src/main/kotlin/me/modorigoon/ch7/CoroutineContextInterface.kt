package me.modorigoon.ch7

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext


fun main() {
    val ctx: CoroutineContext = CoroutineName("myContext")

    val coroutineName: CoroutineName? = ctx[CoroutineName]
    // or ctx.get(CoroutineName)
    println("coroutineName = ${coroutineName?.name}")

    val job: Job? = ctx[Job]
    println("job = $job")
}
