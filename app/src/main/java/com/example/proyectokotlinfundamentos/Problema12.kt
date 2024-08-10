package com.example.proyectokotlinfundamentos

// Nombre: Andres Alaix
// Fecha: 9 de agosto
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema12()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema12() {
    // Desarrolle aquí la lógica
    println("Dame num1:")
    val num1 = readlnOrNull()?.toInt()
    println("Dame num2:")
    val num2 = readlnOrNull()?.toInt()
    println("Dame num3:")
    val num3 = readlnOrNull()?.toInt()

    if (num1 != null && num2 != null && num3 != null) {
        val iguales = when {
            num1 == num2 && num2 == num3 -> 3  // Todos son iguales
            num1 == num2 || num1 == num3 || num2 == num3 -> 2  // Dos son iguales
            else -> 0  // Todos son diferentes
        }
        println(iguales)
    } else {
        println("Por favor, ingresa números válidos.")
    }
}