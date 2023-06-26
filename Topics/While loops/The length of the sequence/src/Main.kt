fun main() {
    var maxSequence = 0

    do {
        val num = readln().toInt()
        if (num > 0){
            maxSequence++
        }
    } while (num != 0)

    println(maxSequence)
}