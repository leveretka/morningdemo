package ua.kyivkug.lambda

fun main3() {
    strProcessing2 {
        if (this.startsWith("2")) return
        if (this.length < 2) "a" else "b"
    }
}

fun strProcessing1(func: String.()->String) =
        (1..100).map { it.toString() }.forEach{ println(it.func())}

inline fun strProcessing2(func: String.()->String) =
        (1..100).map { it.toString() }.forEach{ println(it.func())}

inline fun strProcessing3(noinline func: String.()->String) =
        (1..100).map { it.toString() }.forEach{ println(it.func())}

inline fun strProcessing4(crossinline func: String.()->String) =
        (1..100).map { it.toString() }.forEach{ println(it.func())}

main3()