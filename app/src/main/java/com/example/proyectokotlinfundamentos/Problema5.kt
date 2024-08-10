package com.example.proyectokotlinfundamentos

// Nombre: Andres Alaix
// Fecha: 9 de agosto
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema5()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema5() {
    println("e:")
    val estudiantes = readLine()?.toIntOrNull()
    println("m:")
    val manzanas = readLine()?.toIntOrNull()

    if (estudiantes == null || manzanas == null || estudiantes <= 0) {
        println("Entrada inválida. Por favor ingrese números válidos para número de estudiantes y número de manzanas.")
        return
    }

    val manzanasPorEstudiante = manzanas / estudiantes
    val manzanasSobrantes = manzanas % estudiantes

    println("Cada estudiante recibirá: $manzanasPorEstudiante manzanas.")
    println("Quedarán en la canasta: $manzanasSobrantes manzanas.")
}
