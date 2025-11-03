package week1

fun main() {
    // Using Array
    val colors = arrayOf("red", "blue", "green", "yellow", "purple")
    println("Original color at index 1: ${colors[1]}")
    colors[1] = "cyan"
    println("Updated color at index 1: ${colors[1]}")

    // Using MutableList
    val cities = mutableListOf("Kathmandu", "Pokhara", "Biratnagar")
    cities.add("Lalitpur")
    cities.add(1, "Butwal")
    cities[2] = "Dharan"
    println("City list: $cities")

    // Using arrayListOf
    val devices = arrayListOf("Laptop", "Tablet", "Smartphone")
    devices.add("Smartwatch")
    devices.add(2, "Desktop")
    println("Devices: $devices")
}
