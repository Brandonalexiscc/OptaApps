package buclesAnidados

fun main(){

    for(i in 1..12) {
        for (j in 1..12) {
            println("$i x $j = ${i * j}")
        }
        println()
    }
}