import java.util.*
import kotlin.concurrent.fixedRateTimer

/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/19
* TITLE: 1.3 Suma de dos nombres enters
*/
fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
    println("Indica dos numeros")
    val firstNumber = scanner.nextInt()
    val secondNumber = scanner.nextInt()
    val result = firstNumber+secondNumber
    println(result)
}