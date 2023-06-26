import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val elements = scanner.nextInt()
    var maxNumber = 0

    repeat(elements) {
        val currentNumber = scanner.nextInt()
        if (currentNumber % 4 == 0 && currentNumber > maxNumber) {
            maxNumber = currentNumber
        }
    }

    println(maxNumber)
}