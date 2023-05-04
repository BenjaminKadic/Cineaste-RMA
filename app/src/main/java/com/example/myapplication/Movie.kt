package com.example.myapplication

import java.security.cert.CertPath

data class Movie(
    val id: Long,
    val title: String,
    val overview: String,
    val releaseDate: String,
    val homepage:  String?,
    val genre: String?,
    val posterPath: String
)
