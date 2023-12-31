fun main() {
    var num = 11
    
    if (num>100){
        println("No. is greater")
    } else{
        println("Number is not greater than 100")
    }

    // we can also implement same condition
    var msg = if(num>100) "No. is greater" else "Number is not greater than 100"
    println(msg)



    // Here inplace of switch "when" is used, implenting same above logic using when

    when {
        num > 100 -> {
            println("When No. is greater")
        }
        num < 100 -> {
            println("When Number is less than 100")
        }
    }
}