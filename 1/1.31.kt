import java.util.*

fun main (){
    val scanner = Scanner(System.`in`)
    val dataInput = scanner.nextDouble()
    val metre = (dataInput*39.37)
    val peu =  (metre/12)

    println(peu)

}