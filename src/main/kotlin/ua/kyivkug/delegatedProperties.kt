package ua.kyivkug

import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>) =
            "$thisRef, thank you for delegating '${property.name}' to me!"


    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}

fun main(args: Array<String>) {

    val example = Example()
    example.p = "ABC"
    println(example.p)
}