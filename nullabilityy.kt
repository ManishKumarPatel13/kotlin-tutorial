fun main() {
    var name: String? = null // "?"" is used if the value can be null and we are not sure of it that it will never be null

    name = "John"
    println("The name is ${name!!.length}") "!! is to make sure that till this point some value would be assigned to the variable"
}