// it is like the static keyword in java 
class sum(){
    var an:Int = 9
    companion object{
        var someint:Int = 10
    }
}

fun main(){
    var b = sum.someint // here we don't have to create a instance of the class and call the value
    var a :Int = sum().an // here we have to create an instance
}