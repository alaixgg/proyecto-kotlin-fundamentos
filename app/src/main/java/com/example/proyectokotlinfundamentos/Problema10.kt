package com.example.proyectokotlinfundamentos

// Nombre: Andres Alaix
// Fecha: 9 de agosto
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema10()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema10() {
    // Desarrolle aquí la lógica
    println("Dame num:")
    val num = readlnOrNull()?.toInt()

    val divider = num?.rem(10)

    if (divider==0){
        println("Divisible.")
    }
    else{
        println("No divisible.")
    }

}