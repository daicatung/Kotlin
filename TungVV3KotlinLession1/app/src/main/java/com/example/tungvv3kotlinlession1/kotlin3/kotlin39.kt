package com.example.tungvv3kotlinlession1.kotlin3

import java.util.*

fun main(args: Array<String>){

    println("input number:")
    val num: Int = readLine()!!.toInt()

    var flag = false
    for (i in 2..num / 2) {
        // condition for nonprime number
        if (num % i == 0) {
            flag = true
            break
        }
    }

    if (!flag)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}