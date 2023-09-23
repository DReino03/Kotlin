/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/19
* TITLE: 1.12 De Celsius a Fahrenheit
*/
fun main(){

    import java.util.*
    fun main() {
        val scanner = Scanner(System.`in`).useLocale(Locale.UK)
        val userInputValue = scanner.nextDouble()
        val user2InputValue = scanner.nextDouble()
        println((userInputValue *9/5)+32)
    }
}