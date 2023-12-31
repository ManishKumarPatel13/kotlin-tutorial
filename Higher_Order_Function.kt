// A function which can accept a function as parameter or can return a function is called a higher order function and this functions can be stored in a variable

fun main() {
    highOrder(printme) // here printme returns nothing so it is used as our function also returns nothing
    Highadd(addd)
    val b = highclass(printme)
}

class highclass(func : () -> Unit){ // we can use this in class also
    init{
        func()
    }
}

val printme = {println("This line has been printed")}

val addd = {a: Int, b: Int -> a+b}

fun highOrder(func: ()->Unit){
    func()
}

fun Highadd(addfunc : (Int, Int) -> Int){
    println(addfunc(3, 4))
}