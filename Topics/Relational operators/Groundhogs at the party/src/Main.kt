fun main() {
    // write your code here
    val numCups = readln().toInt()
    val isWeekend = readln().toBoolean()

    val resultParty = (((numCups >= 10) && (numCups <= 20)) && !isWeekend) || (((numCups >= 15) && (numCups <= 25)) && isWeekend)
    println(resultParty)
}