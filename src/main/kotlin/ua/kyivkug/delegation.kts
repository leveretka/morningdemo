package demo

interface Base {
    fun print()
}

interface A {
    fun f()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

object obj : A {
    override fun f() {
        print("inside f() of B")
    }
}

class Derived(b: Base) : Base by b, A by obj


val b = BaseImpl(10)
val derived = Derived(b)
derived.print() // prints 10
derived.f()




