package org.example.controllers

fun main() {// Ejemplo de uso
    val dni = "12345678Z"
    if (validarDNI(dni)) {
        println("El DNI $dni es válido.")
    } else {
        println("El DNI $dni no es válido.")
    }
}

fun validarDNI(dni: String): Boolean {
    val letras = "TRWAGMYFPDXBNJZSQVHLCKE"
    if (dni.length != 9) return false
    val numero = dni.substring(0, 8).toIntOrNull() ?: return false
    val letra = dni[8].toUpperCase()
    val letraCalculada = letras[numero % 23]
    return letra == letraCalculada
}

