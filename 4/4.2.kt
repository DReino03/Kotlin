/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/14
* TITLE: 4.2 calcula la mitjana
*/

fun main(args: Array<String>) {
    var resultat = 0.0

    for (arg in args) {
        val suma =arg.toDouble()
        resultat += suma/args.size
    }
    println(resultat)
}