package week1

fun main() {
    // Integer: Byte, Short, Int, Long
    // Decimal: Float and Double
    // Boolean: true and false
    // Character: Char and String
    // var/val variable_name : data_type = value
    val num: Byte = 1
    println("Type of num is: ${num::class.simpleName}")

    val num2: Short = 32767
    println("Type of num2 is: ${num2::class.simpleName}")

    val num3: Int = 32767
    println("Type of num2 is: ${num3::class.simpleName}")

    val num4: Long = 9_223_372_036_854_775_807L
    println("Type of num2 is: ${num4::class.simpleName}")

    val dec: Float = 3.1415F
    println("Type of dec is : ${dec::class.simpleName}")

    val dec2: Double = 3.1415
    println("Type of dec is : ${dec2::class.simpleName}")

    val bool: Boolean = false // true
    println("Type of bool is : ${bool::class.simpleName}")

    val c: Char = 'C'
    println("Type of c is : ${c::class.simpleName}")

    val name: String = "John"
    println("Type of name is : ${name::class.simpleName}")
}