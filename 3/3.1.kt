/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/12
* TITLE: 3.1 Pinta X números
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Indica un nombre enter")
    val Scanner = Scanner(System.`in`)

    val conta = Scanner.nextInt()

    for (i in 1..conta)
        println(i)
}