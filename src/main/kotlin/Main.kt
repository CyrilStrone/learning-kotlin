fun main(args: Array<String>) {
    println(testSumm(5, 8))
    println(testString(5))
    println(testNamedArguments(x = 3, y = 8, z = 10))
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