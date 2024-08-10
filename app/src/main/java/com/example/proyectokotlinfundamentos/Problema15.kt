package com.example.proyectokotlinfundamentos

// Nombre: Andres Alaix
// Fecha: 9 de agosto
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema15()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema15() {
    // Desarrolle aquí la lógica
    println("Dame un numero de 4 cifras:")
    val number = readLine()?.toIntOrNull()

    val mil = number?.div(1000)
    val tem = number?.rem(1000)
    val centena = tem?.div(100)
    val temporal = number?.rem(100)
    val decena = temporal?.div(10)
    val unidad = number?.rem(10)

    val reverse = ("$unidad$decena$centena$mil")
    if (number.toString() == reverse ){
        println("SÍ")
    }
    else{
        println("NO")
    }

}