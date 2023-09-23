/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/19
* TITLE: 1.10 Quina és la mida de la meva pizza?
*/
import java.util.*
import kotlin.math.*
fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
    println("Especifica l'area de la pipsa")
    val unitat = scanner.nextLine()
    println("introdueix el valor del diametre")
    val userInputValue = scanner.nextDouble()
    val user2InputValue = userInputValue / 2
    print ("Aquest es el valor de l'àrea de la pipsa ")
    print(Math.pow(user2InputValue,2.0)* Math.PI)
    print ("$unitat²")
}
