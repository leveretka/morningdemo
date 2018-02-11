package ua.kyivkug.extensions

import demo.Person

val person = Person("Margo", 23)
person.sayHello()

fun Person.sayHello() = println("Hello, $name!")