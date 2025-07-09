/*
10. Create a Kotlin program that uses a when expression to determine the day of the week based on a given number (1-7).
   Input: 3 | Input: 23
   Output: Wednesday | Output: Invalid Day number

*/


fun main(args: Array<String>){
   val dayOfWeek= 3
   val day = when(dayOfWeek){
       1->"Monday"
       2->"Tuesday"
       3->"Wednesday"
       4->"Thrusday"
       5->"Friday"
       6->"Saturday"
       7->"Sunday"
       else->"Invalid day Number"
   }
   print(day)
}

//solution link: https://pl.kotl.in/Dsc2E2GR-?theme=darcula