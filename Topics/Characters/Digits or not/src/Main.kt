fun main() {
    // write your code here
    repeat(4) {
        val ch: Char = readln().first()
        println(ch in '\u0030'..'\u0039')
    }

}