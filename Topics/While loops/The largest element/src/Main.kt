fun main() {

    var maxElement = 0

    do {
        val n = readln().toInt()
        if (n > maxElement) {
            maxElement = n
        }
    } while (n != 0)

    println(maxElement)

}