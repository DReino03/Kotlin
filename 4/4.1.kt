/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/14
* TITLE: 4.1 Suma de valors
*/

fun main(args: Array<String>) {
    var resultat = 0

    for (arg in args) {
        val suma =arg.toInt()
        resultat += suma
    }
    println(resultat)
}


