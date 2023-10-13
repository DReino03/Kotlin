import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val scan = sc.nextInt()
    do {
        println("Indica la teva data de naixament.")
        println("Primer indica el dia")
        val dia = sc.nextInt()
        println("Segon indica el mes")
        val mes = sc.nextInt()
        println("Tercer indica l'any")
        val any = sc.nextInt()



    }while (sc.hasNextInt())
}