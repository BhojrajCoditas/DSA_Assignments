/*
14. Write a Kotlin function that calculates the volume of a box.
   Input: length = 10, width = 10, height = 3 | Input: length = 10, width = 10
   Output: 300 | Output: 100
*/

fun volumeOfBox(length: Int, width: Int, height: Int): Int{
    val volume = length * width * height
    return volume
}

fun areaOfBox(length: Int, width: Int): Int{
    val area = length * width 
    return area
}
fun main(){
    println(volumeOfBox(10,10,3))
    println(areaOfBox(10,10))
}

