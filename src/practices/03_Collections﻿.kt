package practices

fun main() {

    // We have 3 types of collections: List, Sets Maps

    // LIST

    val readOnlyList = listOf("a", "b", "c", "d", "e", "f") // this list will never change
    println(readOnlyList)

    val NombresHijos = listOf("Danna", "Danv", "Diana", "Dastan")
    println(NombresHijos)


    val mutableList: MutableList<String> = mutableListOf("a", "b", "c", "d", "e", "f")
    println(mutableList) // is lile a  normal list can grow.




}