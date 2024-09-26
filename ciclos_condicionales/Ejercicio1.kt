package ciclos_condicionales
import java.util.*
// Ejercicio 1 números introducidos hasta el negativo
fun main(){
    val scanner = Scanner(System.`in`)
    println("intruduce el número: ")

    for (i in 1..100) {
        if(scanner.nextInt() < 0){
            println("Números introducidos: ${i}")
            break
        }else{
            println("Nuevo número")
            //scanner.nextInt()
        }
    }
}
