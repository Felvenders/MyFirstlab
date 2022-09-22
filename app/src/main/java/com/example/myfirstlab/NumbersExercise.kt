package com.example.myfirstlab

import kotlin.random.Random

class NumbersExercise {
  val numbers: List<Int> = List(10){ Random.nextInt(1, 10) }


    fun avgItems(): Double{

        return numbers.withIndex().filter{ (index, value) -> value % 2 == 0 && index % 2 != 0}.map { (index, value) -> value }.average()
    }
}
