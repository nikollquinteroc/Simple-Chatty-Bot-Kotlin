import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val totalComponents = scanner.nextInt()
    val size = 0
    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(totalComponents) {
        val component = scanner.nextInt()
        when {
            component > size -> larger++
            component < size -> smaller++
            component == size -> perfect++
        }
    }

    print("$perfect $larger $smaller")
}