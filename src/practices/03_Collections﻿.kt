package practices

fun main() {

    // We have 3 types of collections: List, Sets Maps

    // LIST

    val readOnlyList = listOf("a", "b", "c", "d", "e", "f") // this list will never change
    println(readOnlyList)

    val NombresHijos = listOf("Danna", "Danv", "Diana", "Dastan")
    println(NombresHijos)


    val mutableList: MutableList<String> = mutableListOf("a", "b", "c", "d", "e", "f")
    println(mutableList) // is like a  normal list can grow.

    // To prevent unwanted modifications, you can create a read-only view of a mutable list by assigning it to a List:
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    val shapesLocked: List<String> = shapes
    println(" This list is locked: $shapesLocked")


    // Obetin the values

    val primerValor = shapesLocked.first()
    val lastValue = NombresHijos.last()
    println(" the first item of the list is: $primerValor, and the las item is:  $lastValue and in total we have ${shapesLocked.count() + readOnlyList.count() + NombresHijos.count()} save items")


    print("Is Dastan on the list? ${ if ("Dastan" in NombresHijos) "yes" else "no" } ")

    // add and remove
    mutableList.add("g")
    println(mutableList)
    mutableList.remove("g")
    println(mutableList)

    // order
    mutableList.add("a")
    mutableList.add("a")
    mutableList.add("a")
    println(mutableList)
    val cleanList: MutableSet<String> = mutableList.toMutableSet()
    println(cleanList)


    /* Maps */

    val readonlymap = mapOf("juegos" to 10, "comdas" to 3, "horas de sueño" to 4)
    println(readonlymap)

    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)


    // Practice
    // Count the total number of items in two lists

    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println("the total sum is ${greenNumbers.count() + redNumbers.count()}")

    // Check whether a requested protocol is supported
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested in SUPPORTED
        println("Support for $requested: $isSupported")

    // Spell out a number using a map

    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelled as '${number2word[n]}'")


}