/*
6. Define a Kotlin program that uses a map to store the age of different people and prints the ages.
   Input: mapOf("Alice" to 25, "Bob" to 30, "Charlie" to 22)
   Output: Alice is 25 years old (each on a new line)

*/


fun main() {
   val map1 = mapOf("Alice" to 25, "Bob" to 30, "Charlie" to 22)
   for ((name, age) in map1) {
        println("$name is $age years old")
    }
}

//solution link: https://pl.kotl.in/p4019b5lF