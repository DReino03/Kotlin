/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/19
* TITLE: 1.20 Nombres decimals iguals
*/

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
    println("Indica dos nombres decimals:")

    val num1 = scanner.nextDouble()
    val num2 = scanner.nextDouble()
    val result = (num1 == num2)
    println(result)
}
