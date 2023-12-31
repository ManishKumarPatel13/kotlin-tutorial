open class A { // Parent class
    var name = "john"
    open fun add(a: Int, b:Int):Int{
        return a+b
    }
}

class B : A(){
    var name2 = "smith"
    override fun add(a: Int, b: Int):Int {

        val summ = super.add(a, b) // super means parent class
        val sqr = summ*summ
        return sqr
}
}

fun main() {
    val b = B()
    println(b.name2)
    val a = A()
    println(a.name)

    println("Value is ${a.add(3, 4)}")
    println("Value is ${b.add(3, 4)}")
}