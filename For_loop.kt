fun main() {
    var num = 0
    for (i in 0..10){  // here it will run for 0 to 10 means 11 times
        println("The number is ${num++}")
    }

    for (i in 0 until 10){ // Here it will run till the value before 10
        println(i) 
    }

    // For reverse loop
    for (i in 10 downTo 0){
        println("number is: $i")
    }

    // to give step
    for (i in 10 downTo 0 step 2){
        println("Number is :$i")
    }


    // loop array
    var arr = ArrayList<Int>(0)
    arr.add(1)
    arr.add(2)
    arr.add(3)
    arr.add(4)
    arr.add(5)
    arr.add(6)

    for (i in arr){
        print("${i}, ")
    }


}