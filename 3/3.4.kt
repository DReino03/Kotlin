/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/12
* TITLE: 3.4 Imprimeix el rang (2)
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Indica dos nombres enters")
    val Scanner = Scanner(System.`in`)

    val entradaPrimera = Scanner.nextInt()
    val entradaSegunda = Scanner.nextInt()

    for (i in entradaPrimera..entradaSegunda) print("$i,")
    for (i in entradaSegunda..entradaPrimera) print("$i,")

}