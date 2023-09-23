/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/19
* TITLE: 1.9 Calcula el descompte
*/
import java.util.*
fun main() {
    val scanner=Scanner(System.`in`).useLocale(Locale.UK)
    println("Introdueix un valor ")
    val userInputValue = scanner.nextDouble()
    println("Introdueix un valor ")
    val user2InputValue = scanner.nextDouble()
    println("quantitat de descompte")
    print(100-(user2InputValue/userInputValue)*100)
    print ("%")
}
