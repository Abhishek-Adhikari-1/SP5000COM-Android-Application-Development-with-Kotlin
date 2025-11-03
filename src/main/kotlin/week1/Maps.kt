package week1

fun main() {
    fun main() {
        // Immutable map
        val countryCapitals = mapOf(
            "Nepal" to "Kathmandu",
            "India" to "New Delhi",
            "China" to "Beijing"
        )
        println("Immutable Map: $countryCapitals")

        // Mutable map
        val studentMarks = mutableMapOf(
            "Ram" to 85,
            "Sita" to 90,
            "Hari" to 78
        )
        println("Mutable Map: $studentMarks")

        println("Ram's Marks: ${studentMarks["Ram"]}")
        println("Sita's Marks: ${studentMarks.get("Sita")}")
        println("Unknown Student: ${studentMarks.getOrDefault("Krishna", 0)}")

        // Safe access with null check
        val marks = studentMarks["Gita"]
        if (marks != null) {
            println("Gita scored $marks")
        } else {
            println("Gita not found")
        }

        // Using for loop
        for ((student, mark) in studentMarks) {
            println("$student scored $mark")
        }

        // Iterating over keys
        for (key in studentMarks.keys) {
            println("Student: $key")
        }

        // Iterating over values
        for (value in studentMarks.values) {
            println("Marks: $value")
        }

        // Using forEach
        studentMarks.forEach { (name, score) ->
            println("forEach -> $name: $score")
        }

        // Add a new entry
        studentMarks["Krishna"] = 88
        println("After adding Krishna: $studentMarks")

        // Update a value
        studentMarks["Ram"] = 95
        println("After updating Ram: $studentMarks")

        // Remove a key
        studentMarks.remove("Hari")
        println("After removing Hari: $studentMarks")

        // Replace value conditionally
        studentMarks.replace("Sita", 90, 92)
        println("After replacing Sita’s marks: $studentMarks")

        // Put if absent
        studentMarks.putIfAbsent("Gita", 80)
        println("After putIfAbsent: $studentMarks")

        println("Contains key 'Ram'? ${studentMarks.containsKey("Ram")}")
        println("Contains value 92? ${studentMarks.containsValue(92)}")
        println("Is map empty? ${studentMarks.isEmpty()}")
    }

}