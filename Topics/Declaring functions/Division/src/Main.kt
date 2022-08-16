// write your code here
// Write a function named divide that takes two long numbers and returns a double value

fun divide(a: Long, b: Long): Double {
    return a.toDouble() / b.toDouble()
}



/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}