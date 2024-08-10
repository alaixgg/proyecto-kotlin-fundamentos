package com.example.proyectokotlinfundamentos

// Nombre: Andres Alaix
// Fecha: 9 de agosto
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema11()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema11() {
    // Desarrolle aquí la lógica
    println("Dame el presupuesto:")
    val presupuesto = readlnOrNull()?.toInt()
    println("Dame el valor de la comida:")
    val comida = readlnOrNull()?.toInt()
    println("Dame el valor de la electricidad:")
    val electricidad = readlnOrNull()?.toInt()
    println("Dame el valor del internet:")
    val network = readlnOrNull()?.toInt()
    println("Dame el valor del arriendo:")
    val arriendo = readlnOrNull()?.toInt()

    if (comida != null && electricidad != null && network != null && arriendo != null) {
        val total = comida + electricidad + network + arriendo
        if (total < presupuesto!!){
            println("Vamos melos!")
        } else {
            println("Rayos estoy quebrado(a)!")
        }
    }
}

