fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (x in 1..1000){
        val equation = a * x * x * x + b * x * x + c * x + d
        if (equation == 0){
            println(x)
        }
    }


}
