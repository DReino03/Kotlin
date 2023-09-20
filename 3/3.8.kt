/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/12
* TITLE: 3.8 Nombre de dígits
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Eleva el numero")
    val Scanner = Scanner(System.`in`)
    var num = Scanner.next().toInt()
    var count = 0

    while (num != 0) {
        num /= 10
        ++count
    }
    println("Numero de digits: $count")
}