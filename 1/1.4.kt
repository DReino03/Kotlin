import java.util.*

/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/19
* TITLE: 1.4 Calcula l’àrea
*/
fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
    println("Indica dos numeros")
    val firstNumber = scanner.nextInt()
    val secondNumber = scanner.nextInt()
    val result = firstNumber * secondNumber
    println(result)
}