fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    var sum = 0
    val n = b - a + 1
    
    for (i in a..b) {
        sum = (a + b) * n  / 2
    }
    println(sum)
}
