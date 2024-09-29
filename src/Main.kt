import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to our Kotlin calculator")
    println("It was made by Leonid Svietlychnyi and Roman Bak")

    println("Please, choose the operation(+, -, *, /): ")
    val operator = scanner.next()

    println("Enter first value:")
    val num1 = scanner.nextDouble()

    println("Enter second value:")
    val num2 = scanner.nextDouble()

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0) {
                num1 / num2
            } else {
                println("Your second value is 0. It's forbidden to divide by 0")
                println("Please, choose another number")
                return
            }
        }

        else -> {
            println("Invalid operator. Try again")
            return
        }
    }

    println("The result of $num1 $operator $num2 is: $result")
}