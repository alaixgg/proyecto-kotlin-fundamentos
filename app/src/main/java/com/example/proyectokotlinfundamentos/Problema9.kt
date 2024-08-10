package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 9 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema9()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema9() {
    // Desarrolle aquí la lógica
    println("Dame num1:")
    val num1 = readlnOrNull()?.toDouble()
    println("Dame num2:")
    val num2 = readlnOrNull()?.toDouble()

    val double = num2?.plus(2)
    if (num1!! > double!!){
        println("Wow!")
    }
    else{
        println("Aburrido!")
    }
}