import java.util.*

/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2023/01/01
*TITLE: 1.34 Hola Usuari
 */

fun main () {
    println("Indica el teu Nom, Cognom i numero de despatx")
    val scanner = Scanner(System.`in`)
    val userName = scanner.next()

    println("Hola $userName")
}