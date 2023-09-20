/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/12
* TITLE: 3.6 Eleva’l
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Eleva el numero")
    val Scanner = Scanner(System.`in`)

    var primeraEntrada = Scanner.nextInt()
    var segonaEntrada = Scanner.nextInt()
    var result = 1L

    for (i in 1 .. segonaEntrada){
        result *=primeraEntrada
    }
    println(result)
}
