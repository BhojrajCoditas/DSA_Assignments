/*
13. Create a Kotlin program that finds the first occurrence of a negative number in a list using 'break'.
   Input: listOf(5, 8, -3, 10, -7, 2)
   Output: 5, 8


*/


fun main() {
    val numList = listOf(5, 8, -3, 10, -7, 2)

    for (num in numList) {
        if (num < 0) {
            break
        }
        print("$num, ")
    }
}


//solution link: https://pl.kotl.in/KoMIIL3MX