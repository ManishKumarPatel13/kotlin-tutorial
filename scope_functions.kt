fun main() {
    // val user = User()
    // user.name = "John"
    // user.age = 21

    // Above code could be very confusing or large when we have to make many instances. So we will use apply scope function

    // APPLY - here it implies that the values will be applied to the object | Context Object - this, Return Value - Context Object

    val user = User().apply { 
        name = "John"
        age = 21
        mobile_No = "8976324122"
     }
     println("The name of user is ${user.name}")


    //  WITH - used for calling functions on context objects without providing the lambda result | Context object - this, Return Value - lambda result
    val age = with(user){
        println("The name of user is ${user.name}")
        age // This will return the age 
    }
    println(age)


    /* LET - it is often used to provide null safety calls.
     use safe call operator (?.) with let for null safety | Return: lambda result, Context Object: it*/

run{
     var name: String? = null

    //  println(name.length) // this will give error as it is still initialized with null

    name?.let{  // this will only run if the value of name is not null
        println(it.length)
    }
    name = "john"
    name?.let{  // This will run as this time it's not null
        println(it.length)
    }
}

}


class User {
    var name: String = ""
    var age: Int = 0
    var mobile_No: String = ""
}