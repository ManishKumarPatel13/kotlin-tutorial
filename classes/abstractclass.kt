abstract class abclass{
    // in interface we can not define but only declare
    open fun Add(a:Int):Int{
        return a*2
    }
    open var b = 43
}

class imp : abclass(){
    override var b = 32
}

fun main() {
    
}