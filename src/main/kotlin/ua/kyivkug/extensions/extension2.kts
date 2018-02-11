package ua.kyivkug.extensions

val list = (1..20).toMutableList()
list.swap(5, 15)
println(list)

val list2 = ('a'..'z').toMutableList()
list2.swap(4, 16)
println(list2)

//fun MutableList<Int>.swap(index1: Int, index2: Int) {
//    val tmp = this[index1] // 'this' corresponds to the list
//    this[index1] = this[index2]
//    this[index2] = tmp
//}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}
