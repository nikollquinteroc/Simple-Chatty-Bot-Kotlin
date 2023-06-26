import kotlin.math.abs

fun getLastDigit(a: Int): Int {
    return abs(a % 10)
}

/* Do not change code below */
fun main() {
    val a = readln().toInt()
    println(getLastDigit(a))
}