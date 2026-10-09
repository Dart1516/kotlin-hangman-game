//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

var dificulty : Int = 0
var gameRunning = true

val hardWords = listOf(
    "fox", "jay", "wry", "gym", "ivy",
    "sky", "ply", "quiz", "jab", "hex"
)

val mediumWords = listOf(
    "house", "plant", "brick", "sword", "candy",
    "zebra", "flock", "juice", "mirth", "vowel"
)

val easyWords = listOf(
    "garden", "button", "silver", "window", "pencil",
    "rocket", "forest", "bridge", "castle", "hunter"
)


fun stageDificulty(dificulty: Int): Int {
    if (dificulty == 1) {
        println("you have selected the easiest difficulty")
        return 1
    } else if (dificulty == 2) {
        println("you have selected the medium difficulty")
        return 2
    } else if (dificulty == 3) {
        println("you have selected the largest difficulty")
        return 3
    }else
        println("Invalid Dificulty, please select numbers from 1 to 3")
    return 4


}
fun main() {

println("Welcome to this Hangman Game")
    println("my name is Davod Puche and today we are going to play with the easies words in the worlds")
    do {
        println("Please choose you difficult ")
        var userChoicfe = readLine()?.toIntOrNull()?:4
        dificulty = stageDificulty(userChoicfe)
    } while (dificulty > 3)
    if (dificulty == 1) {}

println("do you want to play again?")
    print("YES/NO")
    var wantToPlayAgain = readLine()
    if (wantToPlayAgain == "yes") {
        return
    } else if (wantToPlayAgain == "no") {
        gameRunning = false
    } else
        println("wrong anse select YES or NO:")


}