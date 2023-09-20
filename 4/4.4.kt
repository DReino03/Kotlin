import java.util.Scanner

fun main(){
    println("Indica un numero")
    val scanner = Scanner(System.`in`)
    val userInput = scanner.nextInt()
    val arrList = arrayListOf<Int>( 1, 2, 3, 4, 5, 6, 7, 8, 9,10)

        if (userInput in arrList) println("Si està contingut")
        else println("No està contingut")



}