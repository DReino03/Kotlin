import java.util.*

/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/19
* TITLE: 1.8 Dobla el decimal
*/
fun main() {
    val scanner= Scanner(System.`in`).useLocale(Locale.UK)
    println("introdueix un número amb decimals")
    val userInputValue = scanner.nextDouble()
    println("ahí tienes el doble :)")
    println(userInputValue*2)
}
