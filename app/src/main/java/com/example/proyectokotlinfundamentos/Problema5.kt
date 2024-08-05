package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 5 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema5()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema5() {
    println("Numero de estudiantes: ")
    val e = readLine()?.toIntOrNull()
    println("Numero de manzanas:")
    val m = readLine()?.toIntOrNull()

    if (e == null || m == null || m <= 0 ) {
        println("Entrada inválida. Por favor ingrese números válidos para Numero de estudiantes y Numero de manzanas.")
        return
    }

    val manzanasEstudiante = m / e
    val manzanasCanasta = m % e

    println("Cada estudiante recibirá: $manzanasEstudiante manzanas.")
    println("Quedarán en la canasta: $manzanasCanasta manzanas.")

}