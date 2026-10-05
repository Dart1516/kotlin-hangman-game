package practices

fun main () {
    var customers = 10

    // some customers leave the queue

    customers = 8
    customers = customers + 3   // Example of addition: 11
    customers += 7              // Another example of addition 18
    customers -= 3              // Example of substraction : 15
    customers *= 2              // example of multiplication: 30
    customers /= 3              // example of division: 10

    println("current customers: $customers ")

    println("if we have the double amount of customer the number will be ${customers*2}")

    // Basic types
    // INTEGERS
    val year: Int = 2026
    val amount : Long = 350_000_000_000
    val score: UInt = 100u // 2. UNSIGNED INTEGERS (just positive Int without symbols, the U is also mandatory declare that it is a Unsigned )
    val currentTemperature: Float = 24.5f // use the f at the end to confirm  that it is a float  if not used, Kotlin will assume that is a double
    val price: Double = 19.99
    val isEnable: Boolean = true
    val separator: Char = ' '
    val message: String = "This is a practice"

    println("this year is $year")
    println("and the quantity that I want to have on my bank acount is $amount Dollars  ")


    // declare variables without initialization

    val d: Int
    d = 3
    // Variable explicitly typed and initialized
    val e: String = "Oi"

    println("$d $e"    )














}
