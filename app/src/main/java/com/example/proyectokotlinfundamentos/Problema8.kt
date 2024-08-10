package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 8 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema8()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema8() {
    // Desarrolle aquí la lógica
    println("Dame la base:")
    val base = readlnOrNull()?.toDouble()
    println("Dame el exponente:")
    val exponente = readlnOrNull()?.toDouble()

    if (base != null && exponente != null) {

        val result = Math.pow(base, exponente)
        if (5000<result){
            println("Muy grande.")
        }
        else{
            println("Números óptimos.")
        }

    }


}