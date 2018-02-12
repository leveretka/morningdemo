package ua.kyivkug.lambda

fun main() {
    strProcessing2 {
        if (startsWith("2")) return
        if (length < 2) "a" else "b"
    }
    print("*****")
}

main()

fun strProcessing1(func: String.() -> String) =
        (1..100).map { it.toString() }.forEach { println(it.func()) }

inline fun strProcessing2(func: String.() -> String) =
        (1..100).map { it.toString() }.forEach { println(it.func()) }

inline fun strProcessing3(noinline func: String.() -> String) =
        (1..100).map { it.toString() }.forEach { println(it.func()) }

inline fun strProcessing4(crossinline func: String.() -> String) =
        (1..100).map { it.toString() }.forEach { println(it.func()) }
