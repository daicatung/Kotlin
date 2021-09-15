package com.example.tungvv3kotlinlession1.kotlin3

fun main(args: Array<String>){

    print("input a:")
    val a: Int = readLine()!!.toInt()
    print("input b:")
    val b: Int = readLine()!!.toInt()

    println("Enter operator either +, -, *, /")
    val result = when(val operator = readLine()){
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator is invalid operator."
    }

    print("result: $result")
}