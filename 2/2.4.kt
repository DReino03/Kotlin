/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/6
* TITLE: 2.4 Té edat per treballar
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Te edat per a treballar?")
    val Scanner = Scanner(System.`in`)
    val age = Scanner.nextInt()

    if (age >= 16 && age <= 65) println("Apte per a treballar")
        else println("No te edad per a treballar")

}

