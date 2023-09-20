/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/19
* TITLE: 1.21 Tres nombres iguals
*/

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
    println("Indica tres nombres enters:")


    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()
    val result = (num1 == num2 && num1 == num3)
    println(result)
}

