package com.tomato.weather.bean

sealed class TempUnit(var tag: String) {
    object SHE : TempUnit("she")
    object HUA : TempUnit("hua")
}
