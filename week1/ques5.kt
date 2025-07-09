/*
5. Create a class named 'Person' with a constructor and a method to display the person's name.
   Input: val person = Person("Agent Jack"); person.display()
   Output: My name is Agent Jack

*/


// class creation with constructor
class Person(val name: String){
    fun display(): String{
        return "My name is $name"
    }
}

fun main() {
    val person = Person("Agent Jack")
    val person1 = Person("John Wick")
    println(person.display())
    println(person1.display())
    
}

//solution link: https://play.kotlinlang.org/embed?short=74bBvsnV1&theme=darcula