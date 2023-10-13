import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val numero: Int
    var NumPrimo = true
    var SiguientePrimo: Int
    var salir = true
    var ContP = 0

    print("Introduce un número: ")

    do {
        if (!scan.hasNextInt()) {
            print("Eso no es un entero. Vuelve a intentarlo: ")
            scan.nextLine()
        }
    } while (!scan.hasNextInt())

    numero = scan.nextInt()

    if (numero < 1) {
        NumPrimo = false
    } else if (numero == 2) {
        NumPrimo = true
    } else {
        for (i in 2..numero) {
            if (numero % i == 0 && i != numero) {
                NumPrimo = false
            }
        }
    }

    if (!NumPrimo) {
        SiguientePrimo = numero
        do {
            SiguientePrimo = SiguientePrimo + 1
            salir = true
            for (i in 2..SiguientePrimo) {
                if (numero % i == 0) {
                    salir = false
                }
            }
        } while (!salir)
    }
}
