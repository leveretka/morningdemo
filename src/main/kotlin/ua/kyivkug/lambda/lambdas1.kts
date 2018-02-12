package ua.kyivkug.lambda

val sumOfTwo = { x: Int, y: Int -> x + y }
val mulOfTwo = { x: Int, y: Int -> x * y }

fun calcSum(list: List<Int>, sum: (x: Int, y: Int) -> Int) = list.reduce(sum)

println(calcSum((1..15).toList(), {x, y -> x + y}))
println(calcSum((1..15).toList(), mulOfTwo))
