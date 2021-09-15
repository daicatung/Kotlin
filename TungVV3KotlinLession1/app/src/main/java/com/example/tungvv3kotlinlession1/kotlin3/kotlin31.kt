package com.example.tungvv3kotlinlession1.kotlin3

fun main(args: Array<String>){
    var score: Int
    do{
        println("input score:")
        score = readLine()!!.toInt()
    }while (score < 0 || score > 10)
    if (score < 5)
        print("You fail!!!")
    else
        print("You pass")
}