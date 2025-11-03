package week1

fun main(){
    // Basic do-while loop
    var x = 1
    do {
        println("Do-While Loop - Value: $x")
        x++
    } while (x <= 5)

    // Do-while that runs at least once
    var y = 10
    do {
        println("Do-While Loop - Runs even if false (y=$y)")
        y++
    } while (y < 10)

    // Do-while with decrement
    var z = 5
    do {
        println("Do-While Loop - Countdown: $z")
        z--
    } while (z > 0)
}