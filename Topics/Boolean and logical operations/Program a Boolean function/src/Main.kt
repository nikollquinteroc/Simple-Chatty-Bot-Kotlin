fun main() {
    val x = readLine().toBoolean() // read other values in the same way
    val y = readLine().toBoolean()
    val z = readLine().toBoolean()
    // write your code here
    val result = !(x && y) || z
    println(result)

}