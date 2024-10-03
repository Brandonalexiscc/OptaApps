package trabajoFinal

import java.util.Scanner
import kotlin.math.pow
import kotlin.random.Random

class Ejercicios {

    // Ejercicio 1: Reemplazar '3' por 'E' y formatear con guiones
    fun ejercicioReemplazar3() {
        for (i in 0..99999) {
            var numero = i.toString().padStart(5, '0')
            numero = numero.replace('3', 'E')
            val formato = numero.toCharArray().joinToString("-")
            println(formato)
        }
    }

    // Ejercicio 2: Tablas de multiplicar
    fun tablasDeMultiplicar() {
        for (i in 1..12) {
            for (j in 1..12) {
                println("$i x $j = ${i * j}")
            }
            println()
        }
    }

    // Ejercicio 3: Ciclo condicional con input de usuario
    fun cicloCondicional() {
        val scanner = Scanner(System.`in`)
        println("Introduce un número negativo para detener:")
        for (i in 1..100) {
            val numero = scanner.nextInt()
            if (numero < 0) {
                println("Números introducidos: $i")
                break
            } else {
                println("Nuevo número")
            }
        }
    }

    // Ejercicio 4: Contando de 100 a 0 con decremento de 7
    fun conteoDecremento() {
        for (i in 100 downTo 0 step 7) {
            println("Contando $i")
        }
    }

    // Ejercicio 5: Adivina el número
    fun adivinaElNumero() {
        val random = Random.nextInt(0, 100)
        println("Ingresa un número:")
        var numero = readLine()!!.toInt()
        while (numero != random) {
            if (numero < random) {
                println("El número es mayor")
            } else {
                println("El número es menor")
            }
            numero = readLine()!!.toInt()
        }
        println("¡Felicidades, adivinaste el número!")
    }

    // Ejercicio 6: Sueldo mayor
    fun sueldoMayor() {
        val scanner = Scanner(System.`in`)
        val sueldos = mutableListOf<Int>()
        for (i in 1..9) {
            println("Ingresa un sueldo:")
            val sueldo = scanner.nextInt()
            sueldos.add(sueldo)
            println("El sueldo mayor es: ${sueldos.maxOrNull()}")
        }
    }

    // Ejercicio 7: Doble y triple de un número
    fun dobleYTriple() {
        val scanner = Scanner(System.`in`)
        println("Introduce un valor entero:")
        val numero = scanner.nextInt()
        val doble = numero * 2
        val triple = numero * 3
        println("El número es $numero, el doble es $doble y el triple es $triple")
    }

    // Ejercicio 8: Área de una circunferencia
    fun areaCircunferencia() {
        val pi: Double = 3.14
        val scanner = Scanner(System.`in`)
        println("Introduce el radio:")
        val radio = scanner.nextDouble()
        val area = pi * radio.pow(2)
        println("Área de la circunferencia: $area")
    }

    // Ejercicio 9: Longitud de una circunferencia
    fun longitudCircunferencia() {
        val pi: Double = 3.14
        val scanner = Scanner(System.`in`)
        println("Introduce el radio:")
        val radio = scanner.nextInt()
        val longitud = 2 * pi * radio
        println("Longitud de la circunferencia: $longitud")
    }

    // Ejercicio 10: Conversión de grados Celsius a Fahrenheit
    fun conversionGrados() {
        val scanner = Scanner(System.`in`)
        println("Introduce los grados Celsius:")
        val celsius = scanner.nextInt()
        val fahrenheit = 32 + ((9 * celsius) / 5)
        println("$celsius grados Celsius son $fahrenheit Fahrenheit")
    }

    // Ejercicio 11: Conversión de km/h a m/s
    fun conversionKmAMs() {
        val scanner = Scanner(System.`in`)
        println("Introduce los km/h:")
        val km = scanner.nextInt()
        val ms = km / 3.6
        println("$km km/h son $ms m/s")
    }

    // Ejercicio 12: Media de un vector
    fun mediaVector() {
        val scanner = Scanner(System.`in`)
        val vector = IntArray(5)
        var suma = 0
        for (i in vector.indices) {
            println("Introduce el valor ${i + 1}:")
            vector[i] = scanner.nextInt()
            suma += vector[i]
        }
        val media = suma / vector.size
        println("La media es: $media")
    }

    // Ejercicio 13: Ordenamiento por burbuja
    fun burbuja(arr: IntArray) {
        val n = arr.size
        var intercambio: Boolean
        for (i in 0 until n - 1) {
            intercambio = false
            for (j in 0 until n - 1 - i) {
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                    intercambio = true
                }
            }
            if (!intercambio) break
        }
    }

    // Ejercicio 14: Ordenar y mostrar números
    fun ordenarNumeros() {
        val numeros = IntArray(10)
        println("Ingresa 10 números:")
        for (i in numeros.indices) {
            numeros[i] = readLine()!!.toInt()
        }
        var inicio = 0
        var fin = numeros.size - 1
        println("Números ordenados:")
        while (inicio <= fin) {
            println(numeros[inicio])
            inicio++
            if (inicio <= fin) {
                println(numeros[fin])
                fin--
            }
        }
    }

    // Ejercicio 15: Matriz 10x10 con sumas de filas y columnas
    fun matriz10x10() {
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

        println("Tabla 10x10:")
        tabla.forEach { fila -> println(fila.joinToString(" ")) }
        println("\nSuma de filas:")
        sumaFilas.forEachIndexed { index, suma -> println("Fila $index: $suma") }
        println("\nSuma de columnas:")
        sumaColumnas.forEachIndexed { index, suma -> println("Columna $index: $suma") }
    }

    // Ejercicio 16: Suma de dos matrices 3x3
    fun sumaMatrices() {
        val matriz1 = Array(3) { IntArray(3) }
        val matriz2 = Array(3) { IntArray(3) }
        val sumaMatriz = Array(3) { IntArray(3) }

        for (i in 0 until 3) {
            for (j in 0 until 3) {
                matriz1[i][j] = (1..10).random()
                matriz2[i][j] = (1..10).random()
                sumaMatriz[i][j] = matriz1[i][j] + matriz2[i][j]
            }
        }

        println("Suma de matrices 3x3:")
        sumaMatriz.forEach { fila -> println(fila.joinToString(" ")) }
    }

    // Ejercicio 17: Matriz 5x5 con suma de índices
    fun matriz5x5() {
        val matriz = Array(5) { IntArray(5) }

        for (i in 0 until 5) {
            for (j in 0 until 5) {
                matriz[i][j] = i + j
            }
        }

        println("Contenido de la matriz 5x5:")
        matriz.forEach { fila -> println(fila.joinToString(" ")) }
    }
}

fun main() {
    val ejercicios = Ejercicios()

    // Puedes llamar a los métodos para ejecutar los ejercicios
    ejercicios.ejercicioReemplazar3()
    ejercicios.tablasDeMultiplicar()
    ejercicios.cicloCondicional()
    ejercicios.conteoDecremento()
    ejercicios.adivinaElNumero()
    ejercicios.sueldoMayor()
    ejercicios.dobleYTriple()
    ejercicios.areaCircunferencia()
    ejercicios.longitudCircunferencia()
    ejercicios.conversionGrados()
    ejercicios.conversionKmAMs()
    ejercicios.mediaVector()
    ejercicios.ordenarNumeros()
    ejercicios.matriz10x10()
    ejercicios.sumaMatrices()
    ejercicios.matriz5x5()
}
