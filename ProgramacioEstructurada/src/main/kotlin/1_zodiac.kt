import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var salida = true
do{
    println("Indica la teva data de neixement")
    println("Indica el teu dia")
    val dia = sc.nextInt()
    println("Indica el teu mes")
    val mes = sc.nextInt()
    println("Indica el teu any")
    val any = sc.nextInt()
    if (mes in 1..12){
        when(mes){
            1,3,5,7,8,10,12 -> dia in 1..30
            4,6,9,11 -> dia in 1..30
            2 ->{
                if (any%4 != 0 || any % 400 == 0){
                    dia in 1..29
                }else{
                    dia in 1..28
                }

            }            }
    }
    if (mes in 1..12 && dia in 1..31) {
        println("Tu signo zodiacal es .")
        when {
            (mes == 3 && dia >= 21) || (mes == 4 && dia <= 19) -> println("Aries")
            (mes == 4 && dia >= 20) || (mes == 5 && dia <= 20) -> println("Tauro")
            (mes == 5 && dia >= 21) || (mes == 6 && dia <= 20) -> println("Géminis")
            (mes == 6 && dia >= 21) || (mes == 7 && dia <= 22) -> println("Cáncer")
            (mes == 7 && dia >= 23) || (mes == 8 && dia <= 22) -> println("Leo")
            (mes == 8 && dia >= 23) || (mes == 9 && dia <= 22) -> println("Virgo")
            (mes == 9 && dia >= 23) || (mes == 10 && dia <= 22) -> println("Libra")
            (mes == 10 && dia >= 23) || (mes == 11 && dia <= 21) -> print("Escorpio")
            (mes == 11 && dia >= 22) || (mes == 12 && dia <= 21) -> println("Sagitario")
            else -> println("Capricornio")
        }
        salida = false
    }
}while(salida)
}
