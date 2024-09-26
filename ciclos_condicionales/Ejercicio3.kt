package ciclos_condicionales
import kotlin.random.Random
//Ejercicio 3 Juego de adivina el número

fun main(){
    println("ingresa un número:")
    val random = (Random.nextInt(0, 100))
    var numero = readLine()!!.toInt()
    while(numero != random) {
        if(numero < random){
            println("El número es mayor")
        }else{
            println("El número es menor")
        }
        numero = readLine()!!.toInt()
    }
    println("Felicidades, adivinaste el número")
}