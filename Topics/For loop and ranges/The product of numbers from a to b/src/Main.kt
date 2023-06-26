fun main() {
    val (num1, num2) = List(2) { readln().toInt() }
    var result = 1L
    for (i in num1 until num2) {
        result *= i
    }
    println(result)
}