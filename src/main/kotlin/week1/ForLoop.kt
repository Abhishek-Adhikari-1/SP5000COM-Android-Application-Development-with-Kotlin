package week1

fun main() {

    // Basic for loop (range)
    for (i in 1..5) {
        println("Number: $i")
    }

    // Range using until
    for (i in 1 until 5) {
        println("Until Example: $i")
    }

    // For loop with step
    for (i in 1..10 step 2) {
        println("Step Example: $i")
    }

    // Reverse loop (downTo)
    for (i in 10 downTo 1) {
        println("DownTo Example: $i")
    }

    // Reverse loop with step
    for (i in 10 downTo 1 step 2) {
        println("DownTo Step Example: $i")
    }

    // Loop through array
    val fruits = arrayOf("Apple", "Banana", "Cherry")
    for (fruit in fruits) {
        println("Fruit: $fruit")
    }

    // Loop through list
    val animals = listOf("Cat", "Dog", "Lion")
    for (animal in animals) {
        println("Animal: $animal")
    }

    // Loop through array with index
    val colors = arrayOf("Red", "Green", "Blue")
    for ((index, color) in colors.withIndex()) {
        println("Color at index $index = $color")
    }

    // Loop through string
    for (ch in "Kotlin") {
        println("Character: $ch")
    }

    // Loop through map
    val capitals = mapOf("Nepal" to "Kathmandu", "India" to "Delhi", "China" to "Beijing")
    for ((country, capital) in capitals) {
        println("$country → $capital")
    }

    // Loop using indices
    val numbers = arrayOf(10, 20, 30)
    for (i in numbers.indices) {
        println("Index $i = ${numbers[i]}")
    }

    // Nested for loop
    for (i in 1..3) {
        for (j in 1..2) {
            println("i=$i, j=$j")
        }
    }

    // Loop with break
    for (i in 1..10) {
        if (i == 6) break
        println("Break Example: $i")
    }

    //⃣ Loop with continue
    for (i in 1..5) {
        if (i == 3) continue
        println("Continue Example: $i")
    }

    // Loop through Char range
    for (ch in 'A'..'E') {
        println("Char: $ch")
    }

    // Loop with label
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) break@outer
            println("Label Example: i=$i, j=$j")
        }
    }
}
