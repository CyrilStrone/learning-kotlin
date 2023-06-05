fun main() {
    val child = Person(firsName = "Slava", lastName = "Strone", age = 10)
    val p1 = Person(firsName = "Cyril", lastName = "Strone", age = 21, child)

    var rectangle1 = Rectangle(height = 5.0, length = 2.0)
    println("The perimeter is ${rectangle1.perimetr}")
    var rectangle2 = Rectangle(height = 5.0, length = 2.0)
    println(rectangle1 == rectangle2)
}

class Person(val firsName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() //ArrayList

    init { //Первичный конструктор
        println("Person is created $firsName")
    }

    constructor(firsName: String, lastName: String, age: Int, child: Person) : this(firsName, lastName, age) {
        children.add((child))
    }//Вторичный контруктор
}
//data - добавляет подсказки?
data class Rectangle(var height: Double, var length: Double) {
    var perimetr = (height + length) * 2

    var test = 1
        get() = field + 1
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length
}