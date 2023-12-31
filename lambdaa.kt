fun square(num: Int): Int{
    return num*num
}

// now we will implement same logic using lambda expression
val sq = {x:Int-> x*x} // the structure is like {parameter -> body}

val add: (Int, Int) -> Int = {x, y -> x+y} // here we defined the datatype and return type first

val printt : (String) -> Unit = {st -> println("hello")} // Unit is used if we don't want any return value

fun main() {
    println("The square of 2 is: ${square(2)}")
    println(sq(2)) // used sq and given it parameter as 2
    printt("")
}