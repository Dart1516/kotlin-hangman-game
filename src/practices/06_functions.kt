package practices

fun main(args: Array<String>) {


    fun hello() {
        return println("Hello, world!")
    }
    hello()


    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    println(sum(1, 2))

    fun fraseCompuesta(a: String, b: String): String {
        return "$a $b"
    }
    println(fraseCompuesta("Hola", "Dinosaur"))


}