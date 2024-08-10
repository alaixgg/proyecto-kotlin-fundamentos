package com.example.proyectokotlinfundamentos

// Nombre: Andres Alaix
// Fecha: 9 de agosto
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema14()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema14() {
    // Desarrolle aquí la lógica
    println("Dame num1:")
    val num1 = readlnOrNull()?.toInt()
    println("Dame num2:")
    val num2 = readlnOrNull()?.toInt()
    println("Dame num3:")
    val num3 = readlnOrNull()?.toInt()

    if (num1 != null && num2 != null && num3 != null) {
        val mayor = maxOf(num1, num2, num3)
        val cantidadDeMayores = listOf(num1, num2, num3).count { it == mayor }
        if (cantidadDeMayores > 1) {
            println("Hay un empate!")
        } else {
            println(mayor)
        }
    } else {
        println("Por favor, ingresa números válidos.")
    }
}
