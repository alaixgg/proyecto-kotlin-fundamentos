package com.example.proyectokotlinfundamentos

import kotlin.system.exitProcess

// Nombre: Andres Alaix
// Fecha: 9 de agosto
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema7()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7() {

    println("¿Cuántos sonidos del grillo escuchaste por minuto?")
    val sound = readlnOrNull()?.toDouble()

    if (sound != null && sound >= 0 ) {
        val temperature= (sound.div(4)).plus(40)

        println("Dados los sonidos del grillo, la temperatura es de $temperature °F.")
    }

    else{
        println("Seguro investigador, ¿un grillo puede hacer ese número de sonidos?")
    }
}