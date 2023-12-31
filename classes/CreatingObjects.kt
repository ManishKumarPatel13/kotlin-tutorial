public open class subclas{ // : is used to inherit a class 

}

public interface intert{
    fun show(){
        println("hello world")
    }
}

public open class sub_subclas : intert{ // here we don't have to write whether to extend if it's a class or to implement if its a interface it automatically detects

}

fun main() {
    val obj = sub_subclas()
    obj.show()
}