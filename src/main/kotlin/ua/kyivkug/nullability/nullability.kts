package ua.kyivkug.nullability

    val string1: String = "abc"
    val string2: String? = null

//    printStringLength(null, null)
//    printStringLength(null, string2)
//    printStringLength(string1, null)
    printStringLength(string1, string2)

fun printStringLength(string1: String, string2: String?) {

    println(string1.length)

    println(string2?.length)

    println(string2?.length ?: -1)

    println(string2!!.length)
}
