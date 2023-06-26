fun main() {
    // put your code here
    val inputNumber = readln().toInt()
    val firstDigit = inputNumber / 100
    val decInputNumber = inputNumber % 100
    val secondDigit = decInputNumber / 10
    val thirdDigit = decInputNumber % 10

    println("$thirdDigit$secondDigit$firstDigit")

}