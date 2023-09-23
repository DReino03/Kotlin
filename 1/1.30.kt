import java.util.Scanner

/*
* AUTHOR: Daniel Reinosa Luque
* DATE: 2022/09/19
* TITLE: 1.30 Quant de temps?
*/
fun main (){
    val scanner = Scanner(System.`in`)
    println("Indica el temps en segons")
    val input = scanner.nextInt()
    val hora = input/3600
    val minuts = (input-hora*3600)/60
    val segons = input - (hora*3600+minuts*60)
    println("$hora hores $minuts minuts i $segons segons")

}