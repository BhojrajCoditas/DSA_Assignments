/*
3. Create a list of fruits and print each fruit using a loop.
   Input: listOf("Apple", "Banana", "Orange", "Grapes")
   Output: Apple, Banana, Orange, Grapes
*/

fun main() {
    val fruits = listOf("Apple", "Banana", "Orange", "Grapes")
    
    //itreation uisng for loop
    for(fruit in fruits){
        print("$fruit, ")
        
    }
    println()
    //itreation using while loop
    var i = 0
    while(i<fruits.size){
        print("${fruits[i]}, ")
        i++
    }
    
}