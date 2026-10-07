package practices

fun main() {

    val  heightAlice = 171
    val  heightBob = 189
    var taller = heightAlice

    // Simple conditional
    if (heightAlice < heightBob) taller = heightBob

    // if else branch
    if (heightAlice > heightBob){

        taller = heightAlice
        println(" Alice height = $taller")

    } else {
        taller = heightBob
        println(" Bob height is $taller")
    }

    // conditional on an variable
    taller = if (heightAlice > heightBob) heightAlice else heightBob

    // on a expression
    val alturaMaxima = 200
    val alturaOLimite = if ( alturaMaxima > heightAlice) alturaMaxima else heightAlice

    println( "la altura maxima $taller " )
    println( "la altura maxima $alturaOLimite " )


    // use of when

    val userRole = "Editor"
    when (userRole) {
        "Viewer" -> println(" User has read-only access")
        "Editor" -> println(" User has editor access")
        else -> println(" User does not have access")

    }


    var x= 1
    val text = when (x) {
        1 -> "x == 1"
        2 -> "x == 2"
        else -> "x is neither 1 nor 2"
    }
    x =  3
    when (x) {
        1 -> print("x == 1") // the -> symbol knows as an arrow means  "ENTONCES"
        2 -> print("x == 2")
        else -> print("x is neither 1 nor 2 \n")
    }

    // another example

    val localFileSize = 1200
    val remoteFileSize = 1200

    val message = when {
        localFileSize > remoteFileSize -> "Local file is larger than remote file"
        localFileSize < remoteFileSize -> "Local file is smaller than remote file"
        else -> "Local and remote files are the same size"
    }

    println(message)

    val ticketPriority = "Medium"
    when (ticketPriority) {
        "Low", "Medium" -> print("Standard response time")
        else -> print("High-priority handling")
    }


}