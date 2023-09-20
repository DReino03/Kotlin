/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/14/04
*TITLE: 2.11 Calculadora
 */

import java.util.*
fun main () {
    val scanner = Scanner(System.`in`)
    println("Indica primer els numeros i despres l'operador")
    var firstValue = scanner.nextInt()
    var secondValue = scanner.nextInt()
    var operator = scanner.next()

    if (operator == "+") println(firstValue + secondValue)
    else if (operator == "-") println(firstValue - secondValue)
    else if (operator == "/") println(firstValue / secondValue)
    else if (operator == "*") println(firstValue * secondValue)
    else if (operator == "%") println(firstValue % secondValue)

}
