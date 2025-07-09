/*
8. Write a Kotlin program that removes duplicates from a list and prints the unique elements.
   Input: listOf(1, 2, 3, 2, 4, 5, 1, 6)
   Output: [1, 2, 3, 4, 5, 6]


*/


fun main() {
   val numbers = listOf(1, 2, 3, 2, 4, 5, 1, 6)

    val sets = numbers.toSet()

    println(sets)
}


//soluiton link: https://pl.kotl.in/APgzjIMbq