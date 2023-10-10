import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var fechaNacimiento: String
    var numeroSuerte: Int

    var fechaValida = false
    do {
        print("Introduce tu fecha de nacimiento (ddmmaaaa): ")
        fechaNacimiento = scanner.nextLine()

        if (fechaNacimiento.length == 8) {
            var suma = 0
            for (i in 0 until 8) {
                val digito = fechaNacimiento[i].toString().toIntOrNull()
                if (digito != null) {
                    suma += digito
                } else {
                    fechaValida = false
                    break
                }
            }

            var numero = suma
            while (numero >= 10) {
                var nuevaSuma = 0
                while (numero > 0) {
                    nuevaSuma += numero % 10
                    numero /= 10
                }
                numero = nuevaSuma
            }

            fechaNacimiento = numero.toString()

            fechaValida = true
        }

        if (!fechaValida) {
            println("Fecha de nacimiento no válida. Debe ser ddmmaaaa.")
        }
    } while (!fechaValida)

    numeroSuerte = fechaNacimiento.toInt()

    println("Tu número de la suerte es: $numeroSuerte")
}
