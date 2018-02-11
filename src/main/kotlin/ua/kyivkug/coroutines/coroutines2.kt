package ua.kyivkug.coroutines

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking


fun main(args: Array<String>) {
    runBlocking {
        var longResult = longFunction()
        longResult *= longFunction()
        println(longResult)
    }
    Thread.sleep(3000L)
}

suspend fun longFunction(): Int {
    delay(1000L)
    return 42
}