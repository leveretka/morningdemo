package ua.kyivkug.coroutines

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureTimeMillis


fun main(args: Array<String>) {
    val time = measureTimeMillis {
        runBlocking {
            var longResult1 = async { longFunction() }
            var longResult2 = async { longFunction() }
            println(longResult1.await() * longResult2.await())
        }
    }
    println(time)
}
