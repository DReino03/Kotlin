/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/12
* TITLE: 3.2 Calcula la suma dels N primers
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Indica dos nombres enters")
    val Scanner = Scanner(System.`in`)
    var entrada = Scanner.nextInt()
    var i = 1
    var suma = 0
    while(i <= entrada) suma += i++
    println(suma)
}