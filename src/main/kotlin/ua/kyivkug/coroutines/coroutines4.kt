package ua.kyivkug.coroutines

import kotlin.coroutines.experimental.buildSequence

fun fibonacciSequence() = buildSequence {
    var first = 0
    var second = 1
    while (true) {
        yield(first)
        val temp = second
        second = first + second
        first = temp
    }
}

fun main(args: Array<String>) {
    fibonacciSequence().take(20).forEach { println(it) }
}
