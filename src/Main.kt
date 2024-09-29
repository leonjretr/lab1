import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to our Kotlin calculator")
    println("It was made by Leonid Svietlychnyi and Roman Bak")

    println("Оберіть опцію:")
    println("1. Базові арифметичні операції")
    println("2. Розрахунок площини трикутника через радіус вписаної окружності")
    when (scanner.nextInt()) {
        1 -> basicCalc(scanner)
        2 -> calcTriangle(scanner)
        else -> println("Неправильна опція. Спробуйте ще раз")
    }

}

fun basicCalc(scanner: Scanner) {
    println("Будь-ласка, виберіть операцію(+) ")
    val operator = scanner.next()

    println("Введіть перше значення:")
    val num1 = scanner.nextDouble()

    println("Введіть друге значення:")
    val num2 = scanner.nextDouble()

    val result = when (operator) {
        "+" -> num1 + num2

        else -> {
            println("Був обраний неправильний оператор. Спробуйте ще раз ")
            return
        }
    }

    println("Результат $num1 $operator $num2 дорівнює: $result")
}

fun calcTriangle(scanner: Scanner) {

}