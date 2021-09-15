package com.example.tungvv3kotlinlession1.kotlin4

fun sumOfN(n: Int): Int{
    return if(n==1) 1
    else
        n + sumOfN(n-1)
}

fun main(args: Array<String>){

    print("Enter number:")
    var n = readLine()!!.toInt()

    print("Result: ${sumOfN(n)}")
}