package me.modorigoon.ch1

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun getNewsApi(): String {
    delay(5000)
    return "News"
}

suspend fun getUserData(): String {
    delay(1500)
    return "Tony"
}

suspend fun updateNew() {
    println("Update news")
    val news = getNewsApi()
    val upperNews = news.uppercase()
    println("NEWS: $upperNews")
}

suspend fun updateProfile() {
    val user = getUserData()
    println("USER: $user")
}

suspend fun main() {

    val scope = CoroutineScope(Dispatchers.Default)
    scope.launch {
        updateNew()
    }
    scope.launch {
        updateProfile()
    }

    delay(100_000)
}
