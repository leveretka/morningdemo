package ua.kyivkug.coroutines

import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import java.util.concurrent.atomic.AtomicLong
import kotlin.concurrent.thread

val counter: AtomicLong = AtomicLong(0L)

fun main(args: Array<String>) {
        (0..1000000000L).map {
                thread { counter.addAndGet(it) }
        }
        println(counter.get())
}

//fun main(args: Array<String>) {
//    runBlocking {
//        (0..10_000_000L).forEach {
//            launch { counter.addAndGet(it) }
//        }
//    }
//    println(counter.get())
//}
