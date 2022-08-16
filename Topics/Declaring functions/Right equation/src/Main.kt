// write your
// Write a function named isRightEquation() that takes three numbers
// and returns true if the product of the first two numbers
// is equal to the third number. Otherwise, it should return false.

    fun isRightEquation(a: Int, b: Int, c: Int): Boolean {
        return a * b == c
    }



/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(isRightEquation(a, b, c))
}