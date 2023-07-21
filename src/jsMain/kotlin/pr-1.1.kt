package src.jsMain.kotlin

object OddEvenCheck {
    @JvmStatic
    fun main(args: Array<String>) {
        val number = 17
        if (number % 2 == 0) {
            println("$number is an even number.")
        } else {
            println("$number is an odd number.")
        }
    }
}
