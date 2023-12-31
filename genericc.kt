// generic is used when we don't know the datatype and avoid run-time error

class Genclass<T> (value: T){ // T is used as template and can be any datatype and can be defined later
    init{
        println("Value is $value")
    }
}

fun <T> Text(text : T){  // we can use it in functions also
    print("Text is $text ")
}
fun main() {
    val gen = Genclass<Int>(5) // when creating object of generic class we have to write the datatype inside the <> which will replace T in its original declaration
    val gen2 = Genclass<String>("string used")
}