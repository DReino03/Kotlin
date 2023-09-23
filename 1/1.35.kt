import java.util.*

/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2023/01/01
*TITLE: 1.35 Creador de targetes de treball
 */

fun main (){
    println("Indica el teu Nom, Cognom i numero de despatx")
    val scanner = Scanner(System.`in`)
    val userName = scanner.next()
    val userSurname = scanner.next()
    val userOfficeNum = scanner.nextInt()

    println("Empleat:$userName $userSurname - Despatx: $userOfficeNum")

}