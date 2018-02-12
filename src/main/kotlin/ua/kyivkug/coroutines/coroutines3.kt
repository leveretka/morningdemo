package ua.kyivkug.coroutines

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureTimeMillis


fun main(args: Array<String>) {
    val time = measureTimeMillis {
        runBlocking {
            var longResult1 = async { longComputation() }
            var longResult2 = async { longComputation() }
            println(longResult1.await() * longResult2.await())
        }
    }
    println("Worked $time milliseconds")
}

suspend fun longComputation(): Int {
    delay(1000L)
    return 42
}
