import kotlin.math.pow

fun main() {
    val exercises: Int = 13

    var exercisesSolved: Int = 0
    exercisesSolved += 1

    val myAge: Int = 17
    exercisesSolved++

    var ageAsDouble: Double =myAge.toDouble()
    ageAsDouble = (ageAsDouble + 30) / 2
    exercisesSolved++

    val testNum = 13
    val evenOdd = testNum % 2
    exercisesSolved++

    var answer = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3
    exercisesSolved++

    var age = 16
    println(age)
    age = 30
    println(age)
    exercisesSolved++

    val a1: Int = 46
    val b1: Int = 10
    //1
    val answer1: Int = (a1 * 100) + b1
    println(answer1)
    //2
    val answer2: Int = (a1 * 100) + (b1 * 100)
    println(answer2)
    //3
    val answer3: Int = (a1 * 100) + (b1 / 10)
    println(answer3)
    exercisesSolved++

    val num: Int = (5 * 3) - ((4 / 2) * 2)
    exercisesSolved++

    val a: Double = 10.0
    val b: Double = 20.0
    val average: Double = (a + b) / 2
    println("Среднее: $average")
    exercisesSolved++

    val fahrenheit: Double = 68.0
    val celcius: Double = (fahrenheit - 32) / 1.8
    println("Температура в °C: $celcius")
    exercisesSolved++

    val position: Int = 34
    val row: Int = position / 8
    val column: Int = position % 8
    println("Строка: $row, Столбец: $column")
    exercisesSolved++

    val degrees: Double = 180.0
    val radians: Double = degrees * Math.PI / 180
    println("Угол в радианах: $radians")
    exercisesSolved++

    val x1: Double = 1.0
    val y1: Double = 2.0
    val x2: Double = 4.0
    val y2: Double = 6.0
    val distance: Double = Math.sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    println("Расстояние: $distance")
    exercisesSolved++



    println(num)
    println("Конечный результат: $answer")
    println("Выполнено заданий: $exercisesSolved")
}