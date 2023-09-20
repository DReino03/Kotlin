/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/10/6
* TITLE: 2.8 Afegeix un segon (2)
*/
import java.util.*
//  Reads an int from the input and prints it.
fun main() {
    println("Indica hores minuts i segons en nombres enters")
    val Scanner = Scanner(System.`in`)
    var hour = Scanner.nextInt()
    var min = Scanner.nextInt()
    var sec = Scanner.nextInt()

    if (++sec == 60){
        sec = 0
        min += 1
    }
    if (min == 60){
        min = 0
        hour += 1
    }
    if (hour == 24){
        hour = 0
    }
    val secondsToPrint = if (sec < 10) "0$sec" else "$sec"
    val minutsToPrint = if (min < 10) "0$min" else "$min"
    val hourToPrint = if (hour < 10) "0$hour" else "$hour"
    print("$hourToPrint: $minutsToPrint : $secondsToPrint")
}