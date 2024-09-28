package vectoresBidimensionales

fun main() {
    val tabla = Array(10) { IntArray(10) }
    val sumaFilas = IntArray(10)
    val sumaColumnas = IntArray(10)

    for (i in 0 until 10) {
        for (j in 0 until 10) {
            tabla[i][j] = (1..10).random()
            sumaFilas[i] += tabla[i][j]
            sumaColumnas[j] += tabla[i][j]
        }
    }

    println("Tabla de 10x10:")
    for (fila in tabla) {
        println(fila.joinToString(" "))
    }

    println("\nSuma de cada fila:")
    sumaFilas.forEachIndexed { index, suma ->
        println("Fila $index: $suma")
    }

    println("\nSuma de cada columna:")
    sumaColumnas.forEachIndexed { index, suma ->
        println("Columna $index: $suma")
    }
}
