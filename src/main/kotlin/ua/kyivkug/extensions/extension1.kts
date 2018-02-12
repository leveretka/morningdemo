package ua.kyivkug.extensions

data class Person(val name: String, val age: Int)

val person = Person("Margo", 23)
person.sayHello()

fun Person.sayHello() = println("Hello, $name!")