import java.util.Scanner

fun main() {
    println("Indica un numero")
    val scanner = Scanner(System.`in`)
    val inputlist = arrayOf(scanner)
    val max = 0
    for (num in 0..inputlist.lastIndex){
        inputlist.maxOf {num}
        println(num)
    }


}

