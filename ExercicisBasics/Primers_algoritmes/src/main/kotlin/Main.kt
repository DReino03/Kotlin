fun main() {
    println("Indica el numero de exercici a resoldre")
    var input = readln().toInt()
    when(input){
        1 -> ex1()
        2 -> ex2()
        3 -> ex3()
        4 -> ex4()
        5 -> ex5()
    }
}
fun ex1(){
    println("Indica un numero")
    val input = readln().toInt()
    println("El numero anterior a aquest es: ${input-1}")
    println("El numero posterior a aquest es: ${input+1}")
}
fun ex2(){
    println("Indica un numero")
    val inputOne = readln().toInt()
    println("Indica un numero")
    val inputTwo = readln().toInt()
    println("La suma es: ${inputOne+inputTwo}")
    println("La resta es: ${inputOne-inputTwo}")
    println("La multiplicació es: ${inputOne*inputTwo}")
    println("La divisió es: ${inputOne/inputTwo}")
}fun ex3(){
    println("Indica una distancia en metres")
    val inputOne = readln().toInt()
    println("La distancia en milles marines és: ${inputOne*0.000539957}")
}fun ex4(){
    println("Indica una quantitat en euros")
    val input = readln().toInt()
    println("$input€ són ${input*0.87}£")
}
fun ex5(){
    println("Indica quants metres d'alçada te la piscina")
    val inputOne = readln().toInt()
    println("Indica quants metres de llargada te la piscina")
    val inputTwo= readln().toInt()
    println("Indica quants metres de longitud te la piscina")
    val inputTree = readln().toInt()
    val metrecubic = inputOne*inputTwo*inputTree

    println("El volum en metres cúbics són $metrecubic")
    println("Són ${metrecubic*1000} litres d'aigua")

}

