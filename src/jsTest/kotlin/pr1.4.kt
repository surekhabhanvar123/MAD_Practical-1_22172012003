fun main() {
    println("Enter value")
    val a = readline()!!.toInt()
    val s = if(a%2==0)
        "$a is even"
    else
        "$a is odd"
    println(s)
}

