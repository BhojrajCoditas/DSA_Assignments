/*
11. Create a Kotlin program that uses a when expression to determine the season based on a given month.
   Input: "Jan"
   Output: Winter

*/


fun main() {
    val month = "Jul"

    val seasons = when (month) {
        "Dec", "Jan", "Feb" -> "Winter"
        "Mar", "Apr", "May" -> "Spring"
        "Jun", "Jul", "Aug" -> "Summer"
        "Sep", "Oct", "Nov" -> "Autumn"
        else -> "Invalid month"
    }

    println(seasons)
}


//solution link: https://pl.kotl.in/toQNTIU-0