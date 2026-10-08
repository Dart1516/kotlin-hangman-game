package practices



// class without body just constructor
class Person2(var name: String = "Loco")
// a Class with 1 constructor and a body
class Person3(var name: String) {
    var age: Int = 10
}

// Constructors and initializer
// Primary constructor parameter that is also a property
class PersonWithProperty(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

class PersonWithAssignment(name: String) {
    // Must be assigned to a property to be usable later
    val displayName: String = name

    fun greet() {
        println("Hello, $displayName")
    }
}


class Person1(var name: String = "Loco")

    fun main(args: Array<String>) {

        val person = Person3("Danna")
        println(person.name)
        println(person.age)

        //You can assign the created instance to a mutable (var) or read-only (val) variable:

        var anonymous = Person2()
        print(anonymous.name)
        val nameUser = Person2("Danna")
        println(nameUser.name)




    }



