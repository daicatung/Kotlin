package com.example.tungvv3kotlinlession1.kotlin

import java.util.*

fun main(args: Array<String>){
    val scan = Scanner(System.`in`)

    print("input number:")
    val a: Int = scan.nextInt()

    print("The ASCII value of a is: ${a.toChar()}")
}