fun main() {
    val n = readln().toInt()
    val numbers = mutableListOf<Int>()
    repeat(n) {
        val number = readln().toInt()
        numbers.add(number)
    }

    val result = longestSequence(numbers)
    println(result)
}

fun longestSequence(numbers: List<Int>): Int {
    var length = 1
    var maxLength = 1

    for (i in 1 until numbers.size) {
        if (numbers[i] >= numbers[i - 1]) {
            length++
        } else {
            if (length > maxLength) {
                maxLength = length
            }
            length = 1
        }
    }
    if (length > maxLength) {
        maxLength = length
    }

    return maxLength
}