/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/14/04
*TITLE: Calcula la lletra del dni
 */

import java.util.*
fun main (){
    val scanner = Scanner(System.`in`)
    println("Indica el teu DNI sense lletra")
    var userInput = scanner.nextInt()
    val word = userInput%23

    when(word){
        0 -> println("$userInput T")
        1 -> println("$userInput R")
        2 -> println("$userInput W")
        3 -> println("$userInput A")
        4 -> println("$userInput G")
        5 -> println("$userInput M")
        6 -> println("$userInput Y")
        7 -> println("$userInput F")
        8 -> println("$userInput P")
        9 -> println("$userInput D")
        10 -> println("$userInput X")
        11-> println("$userInput B")
        12-> println("$userInput N")
        13 -> println("$userInput J")
        14 -> println("$userInput Z")
        15 -> println("$userInput S")
        16 -> println("$userInput Q")
        17 -> println("$userInput V")
        18 -> println("$userInput H")
        19 -> println("$userInput L")
        20 -> println("$userInput C")
        21 -> println("$userInput K")
        22 -> println("$userInput E")




    }
}