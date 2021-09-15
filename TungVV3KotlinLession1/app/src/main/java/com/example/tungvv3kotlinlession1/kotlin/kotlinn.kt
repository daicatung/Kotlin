package com.example.tungvv3kotlinlession1.kotlin

import java.util.*

fun main(args: Array<String>){

    val scan = Scanner(System.`in`)

    print("input number 1:")
    val number1: Int = scan.nextInt()

    print("input number 2:")
    val number2: Int = scan.nextInt()

    print("sum of 2 number after input:")
    val number3 = number1 + number2
    println(number3)
}