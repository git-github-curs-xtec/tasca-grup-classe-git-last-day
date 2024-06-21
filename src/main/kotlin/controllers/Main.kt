package org.example.controllers

fun main() {
    //TODO or not TODO That's the question :-)
    print("Don't  worry be JAVI")
    print("Print no conflict")
}

fun validarDNI(dni: String): Boolean {
    val letras = "TRWAGMYFPDXBNJZSQVHLCKE"
    if (dni.length != 9) return false
    val numero = dni.substring(0, 8).toIntOrNull() ?: return false
    val letra = dni[8].toUpperCase()
    val letraCalculada = letras[numero % 23]
    return letra == letraCalculada
}
 //toma castanya
 // comentari branca nova