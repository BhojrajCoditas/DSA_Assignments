/*
12. Write a Kotlin program that skips printing even numbers from a list of integers using 'continue'.
   Input: listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
   Output: 1, 3, 5, 7, 9
*/


fun main() {
   val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
   for(i in numbers){
       if(i%2==0){
        continue
    }else{
        print("$i, ")
    }
   }
    

}

//solution link: https://pl.kotl.in/mT0sFrTWw