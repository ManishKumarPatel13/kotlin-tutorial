public open class subcla(val a :Int){ // : is used to inherit a class 
    init{
        println("I am the constructor of SubClass")
    }
}

class secondcla {
    var someint = 10
    constructor(a:Int, b:Int){
        print("This is constructor")
    }

    constructor(a:Int){
        print("This is second constructor")
    }

}



fun main() {
    var a = subcla(5)
    var b = secondcla(0, 2)
    
}