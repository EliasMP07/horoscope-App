package com.devdroid.horoscopapp.domain.model

sealed class HoroscopeInfo(
    val name: int,
    val img: Int
){
    object Aries: HoroscopeInfo()
}