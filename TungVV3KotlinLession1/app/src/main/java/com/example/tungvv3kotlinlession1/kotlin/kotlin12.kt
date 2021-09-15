package com.example.tungvv3kotlinlession1.kotlin

import java.util.*

fun main(args: Array<String>){
    val scan = Scanner(System.`in`)

    print("input number 1:")
    val number1: Float = scan.nextFloat()

    print("input number 2:")
    val number2: Float = scan.nextFloat()

    print("mul of 2 number after input:")
    val number3: Int = (number1 * number2).toInt()
    println(number3)
}