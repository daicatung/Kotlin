package com.example.tungvv3kotlinlession1.kotlin2

import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>){

    val scan = Scanner(System.`in`)

    println("input number:")
    val num: Int = scan.nextInt()

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