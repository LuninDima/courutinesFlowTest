package ru.moondi.courutinesflowtest

import kotlin.random.Random

internal object DataBase {
    fun fetchData() = Random.nextInt()
}