/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/6
* TITLE: 2.7 Parell o senar?
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Indica un nombre enters")
    val Scanner = Scanner(System.`in`)

    val number = Scanner.nextInt()

    if (number%2 == 0) println("parell")
    else println("senar")
}


