package ua.kyivkug.lambda

val sumOfTwo = { x: Int, y: Int -> x + y }
val mulOfTwo = { x: Int, y: Int -> x * y }

fun calcSum(list: List<Int>, sum: (x: Int, y: Int) -> Int) = list.reduce(sum)

fun main1() {
    println(calcSum((1..15).toList(), sumOfTwo))
    println(calcSum((1..15).toList(), mulOfTwo))
}

main1()