import java.util.*

/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 29/11/2022
* TITLE: 1.27 Som iguals?
*/

fun main (){
    println("Indica una minuscula")
    val scanner = Scanner(System.`in`)
    val minus = scanner.next().single()
    println("Indica una majuscula")
    val scannertwo = Scanner(System.`in`)
    val majus = scanner.next().single()

    println(minus-32 == majus)




}
