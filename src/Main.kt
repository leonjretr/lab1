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
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0) {
                num1 / num2
            } else {
                println("Ваше друге значення дорівнює нулю. Заборонено ділити на нуль")
                println("Будь-ласка, введіть інше значення та спробуйте ще раз.")
                return
            }
        }

        else -> {
            println("Був обраний неправильний оператор. Спробуйте ще раз ")
            return
        }
    }

    println("Результат $num1 $operator $num2 дорівнює: $result")
}

fun calcTriangle(scanner: Scanner) {
    println("Введіть значення довжин трьох сторін трикутника:")

    print("Перша сторона: ")
    val a = scanner.nextDouble()

    print("Друга сторона: ")
    val b = scanner.nextDouble()

    print("Третя сторона: ")
    val c = scanner.nextDouble()

    if (!isValidTriangle(a, b, c)) {
        println("Сторони таких довжин не формують правильний трикутник.")
        return
    }

    // обчислення півпериметра
    val s = (a + b + c) / 2

    println("Введіть радіус вписаного кола:")
    val r = scanner.nextDouble()

    // обчислення площи через формулу: Площа = r * s
    val area = r * s

    println("Площа трикутника зі сторонами $a, $b, $c і радіусом вписаного кола $r дорівнює: $area")
}

fun isValidTriangle(a: Double, b: Double, c: Double): Boolean {
    return (a + b > c) && (a + c > b) && (b + c > a)
}