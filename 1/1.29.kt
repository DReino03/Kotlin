import java.util.*
import kotlin.math.sqrt

/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 29/11/2022
* TITLE: 1.29 Equacions de segon grau
*/

fun main () {
    println("Indica les tres variables de una arrel quadrada A,B,C")
    val scanner = Scanner(System.`in`)
    val varA = scanner.nextDouble()
    val varB = scanner.nextDouble()
    val varC = scanner.nextDouble()

    println(-varB + sqrt(varB * varB - 4 * varA * varC) / 2 * varA)
    println(-varB - sqrt(varB * varB - 4 * varA * varC) / 2 * varA)
}

