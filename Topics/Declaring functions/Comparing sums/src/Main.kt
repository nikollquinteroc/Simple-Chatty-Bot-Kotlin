fun isGreater(num1: Int, num2: Int, num3: Int, num4: Int): Boolean {
    return num1 + num2 > num3 + num4
}

fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    val num4 = readln().toInt()

    println(isGreater(num1, num2, num3, num4))
}