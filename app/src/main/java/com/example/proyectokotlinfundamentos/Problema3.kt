package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 3 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema3()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema3() {

    println("Ingrese la nota del primer corte:")
    var corte1= readLine()?.toDoubleOrNull()
    if (corte1 == null || corte1 < 0) {
        println("Su nota no puede ser menor a 0.0")
        return
    }


    println("Ingrese la nota del segundo corte:")
    var corte2= readLine()?.toDoubleOrNull()
    if (corte2 == null || corte2 < 0) {
        println("Su nota no pude ser menor a 0.0")
        return
    }

    println("Ingrese la nota del tercer corte:")
    var corte3= readLine()?.toDoubleOrNull()
    if (corte3 == null || corte3 < 0) {
        println("Su nota no pude ser menor a 0.0")
        return
    }
    corte1 *= 0.33
    corte2 *= 0.33
    corte3 *= 0.34
    val NotaDefinitiva= corte1+corte2+corte3
    println("Su nota definitiva es $NotaDefinitiva")
}
