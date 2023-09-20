import java.util.*

/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 29/11/2022
* TITLE: 1.28 Un és 10
*/

fun main (){
    println("Indica 4 enters si es un es igual a 10 es cert")
    val scanner = Scanner(System.`in`)

    val scannerOne = scanner.nextInt()
    val scannerTwo = scanner.nextInt()
    val scannerThree = scanner.nextInt()
    val scannerFour = scanner.nextInt()

    println(scannerOne == 10||scannerTwo == 10||scannerThree == 10||scannerFour ==10)
}
