import java.util.*

//Función de conversion de grados
fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter your grade: ")
    val grade = scanner.nextInt()
    val formula  = 32 + ((9 * grade) / 5)

    println("Ingresa los grados centigrados: $grade Formula: $formula")
}