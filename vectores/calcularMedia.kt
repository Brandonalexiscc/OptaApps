package vectores

fun main(){
    val scanner = java.util.Scanner(System.`in`)
    val vector = IntArray(5)
    var suma = 0
    for (i in 0 until vector.size){
        println("Ingrese el valor ${i+1}")
        vector[i] = scanner.nextInt()
        suma += vector[i]
    }
    val media = suma / vector.size
    println("La media es: $media")
}