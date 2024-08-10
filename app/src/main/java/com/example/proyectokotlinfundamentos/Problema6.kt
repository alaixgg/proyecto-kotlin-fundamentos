package com.example.proyectokotlinfundamentos

// Nombre: Andres Alaix
// Fecha: 9 de agosto
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema6()
}
// Función que debe desarrollar la lógica para la solución del problema
fun problema6() {
    // Desarrolle aquí la lógica
    println("Dame un número entero:")
    val number = readLine()?.toIntOrNull()

    if (number != null) {
        val centena = number.div(100)
        val temporal = number.rem(100)
        val decena = temporal.div(10)
        val unidad = number.rem(10)

        val total = centena + decena + unidad

        println("La suma de los dígitos del número $number es igual a $total.")
    }
}
