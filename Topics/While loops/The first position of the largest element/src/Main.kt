fun main() {
    val numbers = mutableListOf<Int>()
    var position = 1
    var index = 0
    var maxNumber: Int? = null

    do {
        val num = readlnOrNull()?.toIntOrNull()
        if (num != null) {
            numbers.add(num)
            val currentNumber = numbers[index]
            if (maxNumber == null || currentNumber > maxNumber) {
                maxNumber = currentNumber
                position = index + 1
            }
        }
        index++
    } while (num != null)

    if (numbers.isEmpty()) {
        println("No numbers entered")
    } else {
        print("$maxNumber $position")
    }
}