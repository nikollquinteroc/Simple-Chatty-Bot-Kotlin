fun main() {
    val num = readln().toInt()
    if ((num > -15 && num <= 12) || (num in 15..16) || (num >= 19)) {
        println("True")
    } else {
        println("False")
    }
}