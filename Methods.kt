fun method(){ // FUN IS SHORT FORM FOR FUNCTION and here we don't have to add void if we don't want to return anything

}

fun add() : Int{ // This is how we define a function if we want to return a value of specific datatype
    var a = 10
    var b = 11
    return a + b;
}

fun any() : Any{ // Here any is used if we want to return any type of data
    return "this is any"
}

fun multiply(a: Int, b: Int) : Int{ // here arguments are given in format - name : datatype
    return a*b;
}

fun main() {
    var c = add()
    println(c)
    var d = any()
    println(d)
    var e = multiply(c, 2)
    println(e)

    println("The multiplication is ${multiply(5, 6)}") // if we have multiple values then after $ {} is used
}