fun main() {
    var sumElements = 0
    do {
        val element = readln().toInt()
        if (element > 0) {
            sumElements += element
        }
    } while (element != 0)

    println(sumElements)
}