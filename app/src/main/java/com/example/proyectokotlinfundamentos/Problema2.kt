package com.example.proyectokotlinfundamentos

// Nombre: Andres Alaix
// Fecha: 9 de agosto
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema2() {
    println("Ingresa a:")
    val a= readln().toInt()
    println("Ingresa b:")
    val b= readln() .toInt()
    val c=a+b
    println("$a + $b = $c")
}