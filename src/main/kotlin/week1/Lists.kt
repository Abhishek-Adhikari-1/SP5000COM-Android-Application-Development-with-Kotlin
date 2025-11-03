package week1

fun main() {
    fun main() {
        // Immutable List
        val fruits = listOf("apple", "banana", "mango", "orange")
        println("Immutable List: $fruits")

        // Accessing elements
        println("First fruit: ${fruits[0]}")
        println("Last fruit: ${fruits.last()}")

        // Iterating through list
        for (fruit in fruits) {
            println("Fruit: $fruit")
        }

        // Mutable List
        val numbers = mutableListOf(10, 20, 30)
        println("Mutable List before: $numbers")

        // Adding elements
        numbers.add(40)
        numbers.add(1, 15)
        println("After adding: $numbers")

        // Updating elements
        numbers[2] = 25
        println("After updating: $numbers")

        // Removing elements
        numbers.remove(40)
        numbers.removeAt(0)
        println("After removing: $numbers")

        // Checking if list contains element
        println("Contains 25? ${numbers.contains(25)}")
        println("Contains 100? ${numbers.contains(100)}")

        // Size of list
        println("Size of list: ${numbers.size}")

        // forEach loop
        numbers.forEach { println("Number: $it") }

        // Filtering elements
        val evenNumbers = numbers.filter { it % 2 == 0 }
        println("Even Numbers: $evenNumbers")

        // Mapping elements
        val squares = numbers.map { it * it }
        println("Squares: $squares")

        // Sorting lists
        val unsorted = mutableListOf(5, 1, 3, 2, 4)
        println("Before sort: $unsorted")
        unsorted.sort()
        println("After sort: $unsorted")

        // Reversing list
        val reversed = unsorted.reversed()
        println("Reversed list: $reversed")

        // Combining lists
        val combined = fruits + numbers
        println("Combined List: $combined")

        // Distinct elements
        val duplicates = listOf(1, 2, 2, 3, 3, 3, 4)
        println("Distinct List: ${duplicates.distinct()}")
    }

}