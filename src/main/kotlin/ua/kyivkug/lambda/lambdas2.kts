package ua.kyivkug.lambda

fun main2() {
    Thread {
        for (i in 1..100)
            println(i)
    }.start()

    MyThread (Runnable {
        for (i in 1..100)
            print(i)
    }).start()

    Thread.sleep(2000)
}

class MyThread(val r: Runnable) {
    fun start() = Thread(r).start()
}

main2()