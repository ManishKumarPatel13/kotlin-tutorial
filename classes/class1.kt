
// here the classes created will be by default final and in java they are open

public open class MyClass{

}


// to extend or inherit a class
public open class subclass : MyClass(){ // : is used to inherit a class 

}

public interface inter{
    fun show(){
        println("hello world")
    }
}

public open class sub_subclass : MyClass(), inter{ // here we don't have to write whether to extend if it's a class or to implement if its a interface it automatically detects

}

fun main() {
    
}