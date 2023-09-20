/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/19
* TITLE: 1.22 Qui riu últim riu millor
*/

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    println("Indica el valor del riure de cinc persones:")


    val riure1 = scanner.nextInt()
    val riure2 = scanner.nextInt()
    val riure3 = scanner.nextInt()
    val riure4 = scanner.nextInt()
    val riure5 = scanner.nextInt()

    val calcul =(riure1 < riure5 && riure2 < riure5 && riure3 < riure5 && riure4 < riure5 )
    println(calcul)
}
