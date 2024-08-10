package com.example.proyectokotlinfundamentos

// Nombre: Andres Alaix
// Fecha: 9 de agosto
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema4()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4() {
    println("Ingresa valor artículo 1:")
    val a1 = readlnOrNull()?.toDouble()
    println("Ingresa valor artículo 2:")
    val a2 = readlnOrNull()?.toDouble()
    println("Ingresa valor artículo 3:")
    val a3 = readlnOrNull()?.toDouble()

    if (a1 !=null && a2!=null && a3!=null) {
        val neto = a1 + a2 + a3
        val iva = neto *1.18
        println("Valor neto: $neto")
        println("Valor total: $iva")

    }

}