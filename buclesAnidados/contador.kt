package buclesAnidados

fun main () {
    for (i in 0..99999) {
        var numero = i.toString().padStart(5, '0')
        numero = numero.replace('3', 'E')
        val formato = numero.toCharArray().joinToString("-")

        println(formato)
    }
}