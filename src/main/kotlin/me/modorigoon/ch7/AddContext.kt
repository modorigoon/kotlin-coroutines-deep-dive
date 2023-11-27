package me.modorigoon.ch7

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext


fun main() {
    val ctx1: CoroutineContext = CoroutineName("myContext")
    println(ctx1[CoroutineName]?.name)
    println(ctx1[Job]?.isActive)

    val ctx2: CoroutineContext = Job()
    println(ctx2[CoroutineName]?.name)
    println(ctx2[Job]?.isActive) // default is true

    val ctx3: CoroutineContext = ctx1 + ctx2
    println(ctx3[CoroutineName]?.name)
    println(ctx3[Job]?.isActive)
}
