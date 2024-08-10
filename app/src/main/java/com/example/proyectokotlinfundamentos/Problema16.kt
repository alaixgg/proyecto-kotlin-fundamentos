package com.example.proyectokotlinfundamentos

// Nombre: Andres Alaix
// Fecha: 9 de agosto
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema16()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema16() {
    println("n:")
    val n = readlnOrNull()?.toIntOrNull()
    println("m:")
    val m = readlnOrNull()?.toIntOrNull()
    println("k:")
    val k = readlnOrNull()?.toIntOrNull()

    if (n != null && m != null && k != null) {
        if (k <= n * m && (k % n == 0 || k % m == 0)) {
            println("SÍ")
        } else {
            println("NO")
        }
    } else {
        println("Por favor, ingresa valores válidos para n, m, y k.")
    }
}