/*
 Write a Kotlin program that filters a list of even numbers using 'filter'.
   Input: listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
   Output: 2, 4, 6, 8, 10

*/


fun main() {
   val number1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
   val number2 = number1.filter{it%2==0}
   println(number2)
   
}

//solution link: https://pl.kotl.in/b21UYv7kM?theme=darcula