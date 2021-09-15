package com.example.tungvv3kotlinlession1.kotlin4


fun main(args: Array<String>){

    print("Enter number 1:")
    var num1 = readLine()!!.toInt()

    print("Enter number 2:")
    var num2 = readLine()!!.toInt()

    if (num1>num2){
        num1 += num2
        num2 = num1 - num2
        num1 -= num2
    }

    for (i in num1..num2){
        if (isPrime(i))
            print("$i ")
    }
}