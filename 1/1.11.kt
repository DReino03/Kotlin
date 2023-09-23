/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/19
* TITLE: 1.11 Calculadora de volum d’aire
*/



import java.util.*
fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
    println("Especifica la unitat")
    val unitat = scanner.nextLine()
    println("introdueix el valor de l'amplada")
    val userInputValue = scanner.nextDouble()
    println("introdueix el valor de la llargada")
    val user2InputValue = scanner.nextDouble()
    println("introdueix el valor de la altura")
    val user3InputValue = scanner.nextDouble()
    println("aqui esta el volum")
    print(user2InputValue * userInputValue * user3InputValue)
    print("$unitat³")
}