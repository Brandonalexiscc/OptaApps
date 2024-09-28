package vectoresBidimensionales

fun main() {
    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val sumaMatriz = Array(3) { IntArray(3) }

    println("Cargando la matriz 1 y 2:")
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            matriz1[i][j] = (1..10).random()
            matriz2[i][j] = (1..10).random()
            sumaMatriz[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    println("Suma de las matrices 3x3:")
    for (fila in sumaMatriz) {
        println(fila.joinToString(" "))
    }
}
