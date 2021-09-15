package com.example.tungvv3kotlinlession1.kotlin3

fun main(args: Array<String>){

    print("input a:")
    val a: Int = readLine()!!.toInt()
    print("input b:")
    val b: Int = readLine()!!.toInt()

    var max: Int = if(a>b) a else b

    print("Max number between $a and $b is : $max")
}