import java.util.*

//convertir Km/h a m/s

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter your km: ")
    val number = scanner.nextInt()
    val formuleToMs = number / 3.6
    println("La conversión de km/s a m/s tuvo como resultado: ${formuleToMs}")
}