fun main(){
    // immutable variables
    val PI : Float = 3.14F;

    // mutable variables
    var name: String = "Abhishek";
    var age: Byte = 21;
    var isMale: Boolean = true;

    println("The value of Pi is $PI.")
    println("Hello, My name is $name. I am $age years old and I am ${if (isMale) "male" else "female"}.")

    name = name.uppercase()
    println("New name (uppercase): $name")
}