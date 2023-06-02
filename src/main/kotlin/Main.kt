//Ctrl+Alt+Shift+L  Reformat a file
fun main(args: Array<String>) {
    println(testSumm(5, 8))
    println(testString(5))
    println(testNamedArguments(x = 3, y = 8, z = 10))

    testDefaultArguments(x = 7)
    printEven(1, 6, 3, 2, 6, 12, 23)
    println("распределение под vararg")
    //распределение под vararg
    printEven(*intArrayOf(1, 4, 2, 3, 3, 4, 5), 6, 7, 8)
}

fun testSumm(x: Int, y: Int): Int {
    return x + y
}

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

//void
fun testDefaultArguments(x: Int = 1, y: Int = 4) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.toUpperCase() else name) + number
}

//vararg
fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}