import java.util.*

fun main (){
    val scanner = Scanner(System.`in`)

    var inputList = arrayListOf<Int>()
    var counter = 0-1
    println("Entra el tamany de l'array")
    val size = scanner.nextInt()
    println("Entra els valors")
    for (i in 0 until size){
        inputList.add(scanner.nextInt())
    }

    for (i in 0..inputList.lastIndex){
        if(inputList[inputList.lastIndex] == inputList[i]){
            counter++
        }

    }

    println(counter)
}