fun main() {
    val num = readln().toInt()
    when {
        num % 2 == 0 -> println("EVEN")
        else -> println("ODD")
    }
}