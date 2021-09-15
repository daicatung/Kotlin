package com.example.tungvv3kotlinlession1.kotlin4

fun main(args: Array<String>){

    print("Enter number:")
    var n = readLine()!!.toInt()
    var sum: Int = 0;
        while (n!=0){
            sum+=n%10
            n/=10
        }
    print("Result: $sum")
}