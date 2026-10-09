package practices

import kotlin.contracts.ReturnsNotNull
fun descritordeTextos(talvezString: String?): String {
    if (talvezString != null && talvezString.length > 0) {
        return "String con largura de ${talvezString.length}"
    } else {
    return "Vacio o strinbg nulo"
    }
}

fun lengthString(maybeString: String?): Int? = maybeString?.length



fun main() {
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
    //neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"

    // This is OK
    nullable = null

    // By default, null values aren't accepted
    var inferredNonNull = "The compiler assumes non-nullable"

    // Throws a compiler error
    //inferredNonNull = null

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) // 18
    // println(strLength(nullable))  // Throws a compiler error


    val nullString: String? = null
    println(descritordeTextos(nullString)   )
    println(lengthString(nullString))


}