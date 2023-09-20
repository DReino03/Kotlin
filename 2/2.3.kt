/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/29
* TITLE: 2.3 És un bitllet vàlid
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Valida el teu billet:")
    val Scanner = Scanner(System.`in`)
    val validarBillet = Scanner.nextInt()

    when (validarBillet){
        5 -> println("True")
        10 -> println("True")
        20 -> println("True")
        50 -> println("True")
        100 -> println("True")
        200 -> println("True")
        500 -> println("True")
        else -> println("False")
    }
}