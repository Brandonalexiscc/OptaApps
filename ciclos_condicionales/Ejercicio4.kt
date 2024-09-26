package ciclos_condicionales
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val sueldos = mutableListOf(0)
    for(i in 1 ..9){
        println("Ingresa un número:")
        val sueldo = scanner.nextInt()
        sueldos.add(sueldo)
        println("El sueldo mayor es: ${sueldos.maxOrNull()}")
    }
}