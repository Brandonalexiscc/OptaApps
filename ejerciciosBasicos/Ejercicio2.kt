import java.util.*
import kotlin.math.pow

/*calcular el área de circurferencia */
    const val pi: Double = 3.14
fun main(){
    val scanner = Scanner(System.`in`)
    val radio = scanner.nextInt()
    println("enter your radious: ")
    val numero =scanner.nextDouble()
    val potencia = numero.pow(2)
    val formula = pi * potencia
    println("valor de pi * radio ^ 2: ${formula}")
}

//Calcular la longitud de la circunferencia

//const val pi: Double = 3.14
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//    println("Enter your radious: ")
//    val number = scanner.nextInt()
//    val formule = 2 * pi * number
//    println("El resultado de la longitud es = ${formule}")
//}