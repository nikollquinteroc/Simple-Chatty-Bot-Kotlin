fun main() {
    val hour1 = readln().toInt()
    val hour2 = readln().toInt()
    val hour3 = readln().toInt()

    println(if (hour3 > hour2) "Excess" else if (hour3 < hour1) "Deficiency" else "Normal")
}