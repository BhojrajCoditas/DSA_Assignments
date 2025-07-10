//7. Write a Kotlin function that divides two numbers and handles the case when the denominator is zero using try-catch.
//Input: 5, 2 | Input: 5, 0
//Output: 2.5 | Output: Cannot divide by zero.


fun divide(num: Int, deno: Int): String{
    return  try {
        val res = num.toDouble()/ deno
        res.toString()
    } catch (e: ArithmeticException){
        "Cannot divide by zero"
    }
}

fun main() {
    println(divide(5,0))
    println(divide(5,2))
}