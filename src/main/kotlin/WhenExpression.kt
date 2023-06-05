fun main() {
    testWhen(1)
    testWhen("Hello")
    testWhen(15)
}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("Один")
        2 -> println("Два")
        in 10..20 -> println("От 10 до 20")
        is String -> println("String")
        else -> println("Что-то еще")
    }
}