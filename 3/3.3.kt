/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/12
* TITLE: 3.3 Imprimeix el rang
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Indica dos nombres enters")
    val Scanner = Scanner(System.`in`)

    var enterPrimer = Scanner.nextInt()
    var enterSegon = Scanner.nextInt()
    for (i in enterPrimer until enterSegon)
        print("$i, ")
        print(enterSegon)
}