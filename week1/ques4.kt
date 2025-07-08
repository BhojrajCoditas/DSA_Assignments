/*
4. Define a function named 'multiply' that takes two parameters and returns their product.
   Input: 5, 2
   Output: The product is 10
*/



fun add(a: Int, b: Int): Int{
    return a+b
}

fun sub(a: Int, b: Int): Int{
    return a-b
}
fun multiply(a: Int, b: Int): Int{
    return a*b
}

fun divide(a: Int, b: Int): Int{
    return a/b
}


fun main() {
    println("The Sum is ${add(5,2)}")
    println("The Substraction is ${sub(5,2)}")
    println("The Product is ${multiply(5,2)}")
    println("The Divison is ${divide(5,2)}")
    
}

// solution link: https://play.kotlinlang.org/embed?short=QMBettMRE&theme=darcula