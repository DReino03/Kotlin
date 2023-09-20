/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/6
* TITLE: 2.5 En rang
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Indica cinc numeros enters")
    val Scanner = Scanner(System.`in`)

    val primerEnter = Scanner.nextInt()
    val segonEnter = Scanner.nextInt()
    val tercerEnter = Scanner.nextInt()
    val quartEnter = Scanner.nextInt()
    val cinqueEnter = Scanner.nextInt()

    when (cinqueEnter){
        in segonEnter..tercerEnter -> println("True")
        in tercerEnter..quartEnter -> println("True")
        else  -> println("False")
    }
}
