package com.example.provapractica02.models

data class Tasca(
    val id: Int, val nom: String, val categoria: Categoria, val data: String, val estat: Estat
)
