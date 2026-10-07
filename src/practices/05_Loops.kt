package practices

fun main() {
for (numero in 1..5) {
    print("$numero\n" )
}

    //  While as a source of true
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {

        print("this $cake  is delicious! \n")
    }


    var cakesEaten =0
    while (cakesEaten < 3) {
        print("eat a cake \n" )
        cakesEaten++
    }

    // while with DO
    var cakesBaked = 0
    do {
        print("bake a cake \n" )
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    // Exercise
    // You have a program that counts pizza slices until there's a whole pizza with 8 slices. Refactor this program in two ways:

    var pizzaSlices = 0
    // Start refactoring here
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    // my answer
    do { println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while (pizzaSlices < 8)
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    }

// exercice 2
// Write a program that simulates the Fizz buzz game. Your task is to print numbers from 1 to 100 incrementally, replacing any number divisible by three with the word "fizz", and any number divisible by five with the word "buzz". Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".



// exercise 3
//  You have a list of words. Use for and if to print only the words that start with the letter l.
val words = listOf("dinosaur", "limousine", "magazine", "language")
// Write your code here
