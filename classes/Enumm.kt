// it is a user defined data type

enum class days(val holiday: Boolean = false){ // giving each class a value
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY(true), SUNDAY(true) // created classes or datatypes
}


fun main() {
    println("Today is: " + days.MONDAY)
    println("is today holiday: " + days.MONDAY.holiday)
}