/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/12
* TITLE: 3.5 Taula de multiplicar
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Indica dos nombres enters")
    val Scanner = Scanner(System.`in`)

    val entradaPrimera = Scanner.nextInt()

    for(i in 1..10){
        var result = entradaPrimera * i
        println("$entradaPrimera por $i es igual a $result")
    }
}