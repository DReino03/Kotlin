import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var salida = true

    do {
        println("Indica la teva data de neixement")
        println("Indica el teu dia")
        val dia = sc.nextInt()
        println("Indica el teu mes")
        val mes = sc.nextInt()
        println("Indica el teu any")
        val any = sc.nextInt()

        if (mes in 1..12) {  // Verifica que el mes esté en el rango válido (1 a 12)
            var diaValido = false  // Variable para verificar si el día es válido

            when (mes) {
                1, 3, 5, 7, 8, 10, 12 -> diaValido = dia in 1..31
                4, 6, 9, 11 -> diaValido = dia in 1..30
                2 -> {
                    // Verifica si el año es bisiesto y establece el rango de días en consecuencia
                    diaValido = if (any % 4 != 0 || (any % 100 == 0 && any % 400 != 0)) {
                        dia in 1..28
                    } else {
                        dia in 1..29
                    }
                }
            }

            if (diaValido) {  // Si el día es válido para el mes
                println("Tu signo zodiacal es .")
                when {
                    (mes == 3 && dia >= 21) || (mes == 4 && dia <= 19) -> println("Aries")
                    (mes == 4 && dia >= 20) || (mes == 5 && dia <= 20) -> println("Tauro")
                    (mes == 5 && dia >= 21) || (mes == 6 && dia <= 20) -> println("Géminis")
                    (mes == 6 && dia >= 21) || (mes == 7 && dia <= 22) -> println("Cáncer")
                    (mes == 7 && dia >= 23) || (mes == 8 && dia <= 22) -> println("Leo")
                    (mes == 8 && dia >= 23) || (mes == 9 && dia <= 22) -> println("Virgo")
                    (mes == 9 && dia >= 23) || (mes == 10 && dia <= 22) -> println("Libra")
                    (mes == 10 && dia >= 23) || (mes == 11 && dia <= 21) -> println("Escorpio")
                    (mes == 11 && dia >= 22) || (mes == 12 && dia <= 21) -> println("Sagitario")
                    else -> println("Capricornio")
                }
                salida = false
            }
        }
    } while (salida)  // Repite hasta que se ingrese una fecha válida
}
