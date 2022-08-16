// write your code here
// Write a function named getLastDigit that takes one number and returns its last digit.

fun getLastDigit(number: Int): Char = number.toString().last()

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}