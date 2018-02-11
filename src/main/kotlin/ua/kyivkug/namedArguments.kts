package demo

fun sayHelloTo(name: String, prefix: String = "!", times: Int = 1) {
    for (i in 0 until times)
        println("Hello, $name$prefix")
}

sayHelloTo(name = "Margo")

sayHelloTo("World", "! It's cool!", times = 3)

sayHelloTo(prefix = "World", name = "! It's cool!")










