import java.util.Scanner

fun main() {
    print("Inputa parentesis: \n")
    val scanner = Scanner(System.`in`)
    var inputUser = scanner.next()
    var count = 0

    if (inputUser[0] != ')' && inputUser[inputUser.lastIndex] !='('){
        for(i in 0..inputUser.lastIndex){
            if (count < 0){
                break
            }
            if (inputUser[i] == '('){
                count++
            }
            else if(inputUser[i] ==')'){
                count--
            }

        }
        if (count == 0){
            println("SI")
        }

        else(println("NO"))
    }
    else(println("NO"))
}