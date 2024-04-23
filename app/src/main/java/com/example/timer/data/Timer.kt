package com.example.timer.data

data class Timer(
    val sn: Int,
    val title: String,
    val timeH: Int,
    val timeM: Int,
    val timeS: Int,
    val color: String,
    val loop: String,
    val sound: String,
    val vibration: String
)
