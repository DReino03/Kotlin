
/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2023/01/01
*TITLE: Calcula el capital
 */
import java.util.*
import kotlin.math.*
fun main() {
    val scanner=Scanner(System.`in`).useLocale(Locale.UK)
    println("Indica el capital")
    val firstNumber= scanner.nextInt()
    println("Indica el nombre d'anys")
    val secondNumber= scanner.nextDouble()
    println("Indica el porcentatge")
    val thirdNumber= scanner.nextDouble()

    val capital = firstNumber * Math.pow((1+((thirdNumber/100)/1)).toDouble(), secondNumber)
    println("Aquests seran els ingressos $capital")

}
