fun main() {
    // immutable list
    val aList = listOf("element", "ele 2", "ele 3", 4)
    println(aList)

    // mutable list
    val mList = mutableListOf("Raman", "rajeev", 1)

    mList.add("badtameez")
    mList.add(3)

    println()
    println(mList)
}