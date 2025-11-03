package week1

fun main() {
    // Basic when statement
    val day = 3
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }

    // When used as an expression (returns a value)
    val number = 10
    val result = when (number) {
        in 1..5 -> "Between 1 and 5"
        in 6..10 -> "Between 6 and 10"
        else -> "Out of range"
    }
    println("Result: $result")

    // When with multiple matches in one branch
    val color = "Red"
    when (color) {
        "Red", "Maroon", "Crimson" -> println("Warm color")
        "Blue", "Cyan" -> println("Cool color")
        else -> println("Unknown color")
    }

    // When without argument (acts like if-else ladder)
    val age = 20
    when {
        age < 13 -> println("Child")
        age in 13..19 -> println("Teenager")
        age in 20..59 -> println("Adult")
        else -> println("Senior")
    }

    // When with type checking (is / !is)
    val value: Any = "Kotlin"
    when (value) {
        is Int -> println("It's an integer")
        is String -> println("It's a string of length ${value.length}")
        is Double -> println("It's a double")
        else -> println("Unknown type")
    }

    // When with Boolean condition
    val isRaining = false
    when (isRaining) {
        true -> println("Take an umbrella ☔")
        false -> println("Enjoy the sunshine ☀️")
    }
}