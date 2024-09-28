package vectoresBidimensionales

fun main() {
    val matriz = Array(5) { IntArray(5) }

    for (n in 0 until 5) {
        for (m in 0 until 5) {
            matriz[n][m] = n + m
        }
    }

    println("Contenido de la matriz 5x5:")
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}
