fun main() {
    // immutable set
    val aSet = setOf("12", 1, "raj")
    println(aSet)

    // mutable
    val mSet = mutableSetOf("12", 1, "raj")

    mSet.add("true")
    println(mSet)
}