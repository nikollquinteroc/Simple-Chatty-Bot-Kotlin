

fun main() {

    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()
    val four = readln().toInt()
    val five = readln().toInt()


    val range1 = first..second
    val range2 = third..four
     println(five in range1 || five in range2)
}