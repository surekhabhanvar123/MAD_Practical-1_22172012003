1.4

package src.jsMain.kotlin

fun main() {
    println("Enter value")
    val a = readLine()!!.toInt()
    val s = if (a % 2 == 0)
        "$a is even"
    else
        "$a is odd"
    println(s)
}


