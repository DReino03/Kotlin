import java.util.*

/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2023/01/01
*TITLE: 1.33 És divisible
 */

fun main () {
    val scanner = Scanner(System.`in`)
    println("Indica dos numeros")
    val firstNum = scanner.nextInt()
    val secondNum = scanner.nextInt()

    println(secondNum% firstNum == 0)
}
