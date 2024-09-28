package vectores
fun main() {
    // Leer 10 números
    val numeros = IntArray(10)
    println("Ingresa 10 números enteros:")
    for (i in numeros.indices) {
        numeros[i] = readLine()!!.toInt()
    }

    // Mostrar los números en el orden solicitado
    var inicio = 0
    var fin = numeros.size - 1

    println("Números en el orden solicitado:")
    while (inicio <= fin) {
        // Mostrar el número desde el inicio
        if (inicio <= fin) {
            println(numeros[inicio])
            inicio++
        }

        // Mostrar el número desde el fin
        if (inicio <= fin) {
            println(numeros[fin])
            fin--
        }
    }
}
