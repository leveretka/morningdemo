package ua.kyivkug

val helloWorld = HelloWorld()
helloWorld.sayHelloTo("Marharyta")

class HelloWorld {
    fun sayHelloTo(name: String) {
        println("Hello, $name!")
        print("Hello, ${name.substring(0..2).plus("go")}!")
    }
}
