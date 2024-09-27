package vectores

fun burbuja(arr: IntArray){
    val n = arr.size
    var intercambio = false

    for(i in 0 until n -1){
        intercambio = false
        for(j in 0 until n -1 -i){
            if(arr[j] > arr[j+1]){
                val temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
                intercambio = true
            }
        }
        if(!intercambio) break
    }
}

fun main() {
    val numeros = intArrayOf(64, 34, 25, 12, 22)
    burbuja(numeros)
    println("Lista ordenada: ${numeros.joinToString(", ")}")
}