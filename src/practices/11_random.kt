package practices
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
fun main()  {

    var randomWord = (easyWords.random())
    println(randomWord)
    var word = randomWord.toList()
    println(word)
    var wordInWhiteSpáce = word.joinToString {" "}
    println(wordInWhiteSpáce)
    var whiteSpace = word.map {"_"}.joinToString(" ")
    println(whiteSpace)


}