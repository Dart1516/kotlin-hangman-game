package practices

//  This are properties
// You can declare them as a top-level property in a .kt file

val pi = 3.14159
var counter = 0


//Class with properties
class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
}

// Interface with a property
interface ContactInfo {
    val email: String
}

// Object with properties
object Company {
    var name: String = "Detective Inc."
    val country: String = "UK"
}

// Class implementing the interface
class PersonContact : ContactInfo {
    override val email: String = "sherlock@example.com"
}

// To use a property, refer to it by its name:

fun main(args: Array<String>) {
    fun copyAddress(address: Address): Address {
        val result = Address()
        // Accesses properties in the result instance
        result.name = address.name
        result.street = address.street
        result.city = address.city
        return result
    }

    fun main() {
        val sherlockAddress = Address()
        val copy = copyAddress(sherlockAddress)
        // Accesses properties in the copy instance
        println("Copied address: ${copy.name}, ${copy.street}, ${copy.city}")
        // Copied address: Holmes, Sherlock, Baker, London

        // Accesses properties in the Company object
        println("Company: ${Company.name} in ${Company.country}")
        // Company: Detective Inc. in UK

        val contact = PersonContact()
        // Access properties in the contact instance
        println("Email: ${contact.email}")
        // Email: sherlock@email.com
    }

}