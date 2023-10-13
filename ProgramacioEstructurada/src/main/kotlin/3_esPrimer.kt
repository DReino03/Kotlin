import java.util.*
import kotlin.system.exitProcess

fun main() {
    val scan = Scanner(System.`in`)
    val numero: Int
    var esPrimo = true
    var siguientePrimo: Int
    var salir = true

    print("Introduce un número: ")
    do {
        if (!scan.hasNextInt()) {
            print("Eso no es un entero. Vuelve a intentarlo: ")
            scan.nextLine()
        }
    } while (!scan.hasNextInt())

    numero = scan.nextInt()
    // Retorna si es primo o no en boolean
    esPrimo = primo(numero)

    // Encontrar primo siguiente
    var superior = 0
    siguientePrimo = numero+1
    while (salir){
        if (primo(siguientePrimo)){
            superior  = siguientePrimo
            salir = false

        }
        siguientePrimo++
    }

    if (esPrimo == true){
        println("$numero és primer. El primer immediatament superior es $superior")
    }else println("$numero no és primer. El primer immediatament superior es $superior")

}
fun primo(numero:Int):Boolean{
    // Comprobar si el numero es primo o no

    if (numero <= 1){
        return false
    }
    for (i in 2 until numero){
        if (numero % i ==0){
            return false
        }
    }
    return true
}
