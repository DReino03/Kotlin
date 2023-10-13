import java.util.Scanner

fun main() {
    do {
        val scan = Scanner(System.`in`)
        println("Introduce dos números enteros positivos para comprobar si son amigos.")
        print("Primer número: ")
        val a = scan.nextInt()

        print("Segundo número: ")
        val b = scan.nextInt()

        if (a > 0 && b > 0) {
            val sonAmigos = { a: Int, b: Int ->
                var sumaA = 0
                var sumaB = 0

                for (i in 1 until a) {
                    if (a % i == 0) {
                        sumaA += i
                    }
                }

                for (i in 1 until b) {
                    if (b % i == 0) {
                        sumaB += i
                    }
                }

                sumaA == b && sumaB == a
            }

            if (sonAmigos(a, b)) {
                println("$a y $b son números amigos.")
            } else {
                println("$a y $b no son números amigos.")
            }
        } else {
            println("Por favor, introduce números enteros positivos.")
        }

        println("¿Deseas comprobar otros números amigos? (S/N)")
        val continuar = readLine()?.uppercase() ?: "N"
    } while (continuar == "S")
}
