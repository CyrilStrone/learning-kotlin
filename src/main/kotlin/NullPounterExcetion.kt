fun main() {
    var a: String = "Hello"
    //a = null //NPE исключены
    println(a.length)

    var b: String? = "Test"
    b = null
    //println(b.length)

    //Вернет длину b, если null -> null (Никаких NPE!)
    println(b?.length)

    //bob?.department?.head?.name -> null (Никаких NPE!)

    //Elvis оператор - ?:
    val l = b?.length ?: -1

    b = if ((0..10).random() > 5) "asdf" else null
    // !! - выбрасывает NPE в случае если в переменной null
    val t = b!!.length
    //Может вернуть NPE

}
