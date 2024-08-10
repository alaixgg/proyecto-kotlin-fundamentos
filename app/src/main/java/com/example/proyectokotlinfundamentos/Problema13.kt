package com.example.proyectokotlinfundamentos

// Nombre: Andres Alaix
// Fecha: 9 de agosto
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema13()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema13() {

    println("Dame un numero:")
    val number = readLine()?.toIntOrNull()

    if (number != null) {
        val centena = number.div(100)
        val temporal = number.rem(100)
        val decena = temporal.div(10)
        val unidad = number.rem(10)

        if (centena<decena){
            if (decena<unidad){
                println("SÍ")
            }
        } else{
            println("NO")
        }
    }
}