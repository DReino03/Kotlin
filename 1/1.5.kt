import java.util.*

/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/19
* TITLE: 1.5 Operació boja
*/
fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
    println("Indica quatre numeros")
    val userInputValue = scanner.nextInt()
    val user2InputValue = scanner.nextInt()
    val user3InputValue = scanner.nextInt()
    val user4InputValue = scanner.nextInt()
    println((userInputValue + user2InputValue) * (user3InputValue % user4InputValue))
}