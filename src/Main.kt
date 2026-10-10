//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

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

fun selectWord(dificulty: Int): String {
    return when (dificulty) {
        1 -> hardWords.random()
        2 -> mediumWords.random()
        3 -> easyWords.random()
        else -> easyWords.random()
    }
}

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
    } else {
        println("Invalid Dificulty, please select numbers from 1 to 3")
        return 4
    }
}

fun main() {
    var gameRunning = true

    println("Welcome to this Hangman Game")
    println("my name is David Puche and today we are going to play with the easies words in the worlds")

    while (gameRunning) {
        var dificulty = 4

        do {
            println("\nPlease choose you difficult (1=Easy, 2=Medium, 3=Hard): ")
            val userChoice = readlnOrNull()?.toIntOrNull() ?: 4
            dificulty = stageDificulty(userChoice)
        } while (dificulty == 4)

        val selectedWord = selectWord(dificulty)
        val guessedLetters = mutableSetOf<Char>()
        var attemptsLeft = 6
        var wordGuessed = false

        println("\nGreat you have selected dicifulty: $dificulty")
        println("Let's start guessing!")

        while (attemptsLeft > 0 && !wordGuessed) {

            val displayWord = selectedWord.map { letter ->
                if (letter in guessedLetters) letter else '_'
            }.joinToString(" ")

            println("\nWord: $displayWord")
            println("Attempts left: $attemptsLeft")

            if (!displayWord.contains("_")) {
                wordGuessed = true
                break
            }

            print("Enter a letter: ")
            val input = readlnOrNull()?.lowercase() ?: ""

            if (input.isNotEmpty()) {
                if (input.length == 1 && input.first().isLetter()) {
                    val letter = input.first()

                    if (letter in guessedLetters) {
                        println("You already guessed that letter!")
                    } else {
                        guessedLetters.add(letter)

                        if (selectedWord.contains(letter)) {
                            println("Correct! '$letter' is in the word.")
                        } else {
                            println("Wrong! '$letter' is not in the word.")
                            attemptsLeft--
                        }
                    }
                } else {

                    println("Invalid input! Please enter exactly one letter (a-z).")
                }
            }
        }

        if (wordGuessed) {
            println("\nCongratulations! You survived. The word was: $selectedWord")
        } else {
            println("\nGame Over! You've been hanged. The word was: $selectedWord")
        }

        println("\ndo you want to play again?")
        print("YES/NO: ")
        val wantToPlayAgain = readlnOrNull()?.lowercase()

        if (wantToPlayAgain == "no") {
            gameRunning = false
            println("Thanks for playing. Goodbye!")
        }
    }
}