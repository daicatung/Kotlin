package com.example.tungvv3kotlinlession1.kotlin

import java.util.*

fun main(args: Array<String>){

    var num1: Int = 10
    var num2: Int = 20

    println("when don't swap num1 = $num1 and num2 = $num2")

    // using variable temp
//    var tmp: Int = num1
//    num1 = num2
//    num2 = tmp

    // don't using temp
    num1 += num2
    num2 = num1 - num2
    num1 -= num2
    println("after swap num1 = $num1 and num2 = $num2")
}