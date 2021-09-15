package com.example.tungvv3kotlinlession1.kotlin3

fun main(args: Array<String>){

    print("Enter n:")
    var n: Int = readLine()!!.toInt()
    var result: Int = 0
    for (i in 1..n){
        if (i%2==0)
            result+=i
    }
    print("Result: $result")
}
