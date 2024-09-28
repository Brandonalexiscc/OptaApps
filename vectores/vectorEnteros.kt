package vectores
fun main() {
    val numeros = IntArray(10)
    println("Ingresa 10 números enteros:")
    for (i in numeros.indices) {
        numeros[i] = readLine()!!.toInt()
    }
    var inicio = 0
    var fin = numeros.size - 1

    println("Números en el orden solicitado:")
    while (inicio <= fin) {
        if (inicio <= fin) {
            println(numeros[inicio])
            inicio++
        }
        if (inicio <= fin) {
            println(numeros[fin])
            fin--
        }
    }
}
