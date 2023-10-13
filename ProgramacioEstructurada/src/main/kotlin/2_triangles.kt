import java.util.*
import kotlin.math.*

fun main() {
    val scan= Scanner(System.`in`)

    var numero:Int
    var numeroR:Double
    var salir :Boolean
    var DatosT = false
    var SegmentoA = 0.0
    var SegmentoB = 0.0
    var SegmentoC = 0.0
    var perimetro:Double
    var Area:Double
    var SemiPerimetro:Double


    do{

//precentamos al usuario las obciones del menu
        println(" '1' para introducir las longitudes de un triangulo ")
        println(" '2' para comprobar si el triangulo es un triangulo rectangulo")
        println(" '3' para clasificarlos segun sus costados")
        println(" '4' para calcular el perimetro y el area del triangulo")
        println(" '5' para salir")
        print("Introduce el numero correspondiente a la operacion que quieras realizar: ")

        do { //confirmamos que el numero sea valido

            do { //confimamos que sea un numero sea entero
                if (!scan.hasNextInt()) {
                    print("Eso no es un entero. Vuelve a intentarlo: ")
                    scan.nextLine()
                }
            } while ( !scan.hasNextInt() )

            numero = scan.nextInt()

            if(numero !in 1..5 ){ //confirmamos que el numero se encuentre entre los valores posibles
                println("El numero introducido no se encuentra en las obsiones, prueba de nuevo: ")
                scan.nextLine()
                salir = false
            } else { salir = true }
        } while (salir == false) //continuamos mientras no sea valido
        salir = false

        when(numero) {
            1 -> {
                println( "a cotinuacion, introduce la longitud de los lados del triangulo")
                DatosT = true

                do{

                    for(i in 1..3){
                        when (i){
                            1 -> print(" primer costado: ")
                            2 -> print(" segundo costado: ")
                            3 -> print(" segundo costado: ")
                        }

                        do { //confirmamos que el numero sea valido

                            do { //confimamos que sea un numero sea entero
                                if (!scan.hasNextDouble()) {
                                    print("No es valido. Vuelve a intentarlo: ")
                                    scan.nextLine() //reseteamos el scan para introduir otro valor
                                }
                            } while ( !scan.hasNextDouble() )

                            numeroR = scan.nextDouble()

                            if(numeroR <= 0 ){ //confirmamos que el numero se encuentre entre los valores posibles
                                println("El numero no puede ser menor ni ugual a 0, prueba de nuevo: ")
                                scan.nextLine()
                                salir = false
                            } else { salir = true }
                        } while (salir == false) //continuamos mientras no sea valido
                        salir = false

                        when (i){
                            1 ->  SegmentoA = numeroR
                            2 ->  SegmentoB = numeroR
                            3 ->  SegmentoC = numeroR
                        }
                    }

                    if (  ( SegmentoB < (SegmentoA + SegmentoC )) )  { // ((abs(a-c) < b) i (b < (a+c)))
                        salir = true
                        println("Triangulo guardado con exito")
                        println("")
                    } else {
                        salir = false
                        scan.nextLine()
                        println(" Estos lados no conforman un triangulo, intentalo de nuevo.")
                    }

                } while (salir == false)
                salir = false

            }
            2 -> {
                if (!DatosT ) {
                    println("Debes introducir primero los datos de un triangulo.")
                } else {
                    when{ //nos aseguramos cual es el mas grande para saber el que seria la ipotenusa y confirmamos si pitagoras es posible
                        (SegmentoA > SegmentoB) || (SegmentoA > SegmentoC) -> { // A es hipotenusa
                            if ( (SegmentoB*SegmentoB) + (SegmentoC*SegmentoC) == (SegmentoA*SegmentoA) ) { //pitagoras
                                println ("El triangulo SI es rectangulo, es decir tiene un angulo de 90º")
                            } else { println("El triangulo NO es rectangulo, es decir que no tiene un angulo de 90º") }
                        }
                        (SegmentoB > SegmentoA) || (SegmentoB > SegmentoC) -> { //B es hipotenusa
                            if ( (SegmentoA*SegmentoA) + (SegmentoC*SegmentoC) == (SegmentoB*SegmentoB) ) {
                                println ("El triangulo SI es rectangulo, es decir tiene un angulo de 90º")
                            } else { println("El triangulo NO es rectangulo, es decir que no tiene un angulo de 90º") }
                        }
                        (SegmentoC > SegmentoA) || (SegmentoC > SegmentoB) -> { //C es hipotenusa
                            if ( (SegmentoB*SegmentoB) + (SegmentoA*SegmentoA) == (SegmentoC*SegmentoC) ) {
                                println ("El triangulo SI es rectangulo, es decir tiene un angulo de 90º")
                            } else { println("El triangulo NO es rectangulo, es decir que no tiene un angulo de 90º") }
                        }
                        else -> { println("El triangulo NO es rectangulo, es decir que no tiene un angulo de 90º") } // si todos los lados son iguales
                    }
                }

            }
            3 -> {
                if ( !DatosT ) {
                    println("Debes introducir primero los datos de un triangulo.")
                } else {
                    when{
                        //todos los lados son =
                        SegmentoA == SegmentoB && SegmentoB == SegmentoC -> { println("El triangulo es equilatero") ; println("") }
                        //2 lados son =
                        (SegmentoA == SegmentoB) || (SegmentoB == SegmentoC) || (SegmentoA == SegmentoC) -> { println("El triangulo es isoseles") ; println("") }
                        //ningun lado es =
                        else -> { println("El triangulo es escaleno") ; println("") }
                    }
                }
            }
            4 -> {
                if ( !DatosT ) {
                    println("Debes introducir primero los datos de un triangulo.")
                } else {
                    perimetro = SegmentoA + SegmentoB + SegmentoC //sumamos cada costado para calcular el perimetro
                    println("El perimetro del triangulo es $perimetro u")
                    SemiPerimetro = perimetro / 2
                    Area =
                        sqrt(SemiPerimetro*(SemiPerimetro - SegmentoA)*(SemiPerimetro - SegmentoB )*(SemiPerimetro - SegmentoC)) // A= sqrt(s(s-a)(s-b)(s-c))
                    println("El area del triangulo es $Area u2")
                    println("")
                }
            }
            5 -> { salir = true }
        }

    } while (salir == false)

    println("")
    println(" ¡Espero haberte ayudado! Que tengas un lindo dia (^v^) <3 ")
}