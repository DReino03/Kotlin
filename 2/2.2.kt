/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/29
* TITLE: 2.2 Salari
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Imputa les hores treballades:")
    val Scanner = Scanner(System.`in`)
    val horasTreballades  = Scanner.nextInt()

    if (horasTreballades <= 40) {
        println(horasTreballades * 40) }
     else if (horasTreballades > 40) println(((horasTreballades - 40)* 60) +1600)


}