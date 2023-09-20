/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/6
* TITLE: 2.6 Quina pizza és més gran?
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Indica  el diametre de la pizza rodona i els dos costats de la rectangular")
    val Scanner = Scanner(System.`in`)

    val diametre = Scanner.nextDouble()
    val costatPrimerRect = Scanner.nextDouble()
    val costatSegonRect = Scanner.nextDouble()

    val areaRodona = ((diametre * diametre) * Math.PI)/4
    val areaRect = costatPrimerRect * costatSegonRect

    if (areaRect > areaRodona) println("Pizza Rectangular:$areaRect")
        else println("Pizza Rodona:$areaRodona")
}