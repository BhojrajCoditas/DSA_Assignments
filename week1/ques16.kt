/*
16. Combine two lists using + operator.
   Input: listOf(1,2,3,4), listOf(-1,-2,-3,-4)
   Output: [-1, -2, -3, -4, 1, 2, 3, 4]
*/


fun main() {
   val number1 = listOf(1,2,3,4)
   val number2 = listOf(-1,-2,-3,-4)
   val number3 = number1+number2
   val sortedList = number3.sorted()
   println(sortedList)
    

}

//solution link: https://pl.kotl.in/jkc6Qxl6V