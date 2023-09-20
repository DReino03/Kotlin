/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/29
* TITLE: 2.1 Màxim de 3 nombres enters
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Imputa tres nombres enters:")
    val Scanner = Scanner(System.`in`)
    val Imput = Scanner.nextInt()
    val Imput2 = Scanner.nextInt()
    val Imput3 = Scanner.nextInt()

    if (Imput >= Imput2 && Imput >= Imput3)  println("$Imput Es el mes gran")
    else if (Imput2 >= Imput && Imput2 >= Imput3) println("$Imput2 Es el mes gran")
    else if (Imput3 >= Imput && Imput3 >= Imput2) println("$Imput3 Es el mes gran")


}