import java.util.*

/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/19
* TITLE: 1.6 Pupitres
*/
fun main() {
    val scanner= Scanner(System.`in`)
    println("introdueix alumnes classe a")
    val userInputValue = scanner.nextInt()
    println("introdueix alumnes classe b")
    val user2InputValue = scanner.nextInt()
    println("introdueix alumnes classe c")
    val user3InputValue = scanner.nextInt()
    print("numero de pupitres necessitats ")
    println(((userInputValue/2)+userInputValue%2)+((user2InputValue/2)+user2InputValue%2)+((user3InputValue/2)+user3InputValue%2))
}
