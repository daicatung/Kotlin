package com.example.tungvv3kotlinlession1.kotlin

import java.util.*

fun main(args: Array<String>){

    val scan = Scanner(System.`in`)

    print("input number 1:")
    val number1: Int = scan.nextInt()

    print("input number 2:")
    val number2: Int = scan.nextInt()

    print("div of 2 number after input:")
    var number = number1 / number2
    println(number)

    print("remainder of 2 number after input:")
    number = number1 % number2
    println(number)
}