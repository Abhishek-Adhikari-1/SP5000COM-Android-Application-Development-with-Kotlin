package week1

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        val n1: Int = readInt("Enter the 1st number: ", scanner)
        val n2: Int = readInt("Enter the 2nd number: ", scanner)

        while (true) {
            print("Do you want to week1.add another number? Answer with Y/N: ")
            val option: Char = scanner.next()[0].lowercaseChar()

            if (option == 'y') {
                print("Enter 3rd number: ")
                val n3: Int = readInt("Enter the 3rd number: ", scanner)

                val total = add(n1, n2, n3)
                println("Addition of $n1, $n2, $n3 is $total")
                return
            } else if (option == 'n') {
                val result = add(n1, n2)
                println("Addition of $n1 and $n2 is $result")
                return
            }
        }
    }
}

// Polymorphism
fun add(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun add(n1: Int, n2: Int, n3: Int): Int {
    return n1 + n2 + n3
}

fun readInt(prompt: String, scanner: Scanner): Int {
    while (true) {
        print(prompt)
        if (scanner.hasNextInt()) {
            return scanner.nextInt()
        } else {
            println("Please enter an integer!")
            scanner.next()
        }
    }
}