fun main() {
    // immutable map
    val aMap = mapOf(1 to "raman", 10 to "Rahul")

    println(aMap)


    // mutable map

    val mMap = mutableMapOf(1 to "raman", 10 to "Rahul")
    mMap.put(30, "Ram")

    println(mMap)
}