import java.util.Scanner

fun main() {

    // using readline we can only take string datatype as input
    println("Enter Text: ")
    var input = readLine()
    println("You Entered: $input")

    // Using scanner

    val sc = Scanner(System.`in`)
    println("Enter:")
    var EnteredNum: Int = sc.nextInt()
    println("Number You Entered is :$EnteredNum")


}