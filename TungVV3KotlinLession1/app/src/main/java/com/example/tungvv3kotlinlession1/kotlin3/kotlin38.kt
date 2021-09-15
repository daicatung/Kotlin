package com.example.tungvv3kotlinlession1.kotlin3

fun main(args: Array<String>){
    print("input a:")
    var a: Int = readLine()!!.toInt()
    print("input b:")
    var b: Int = readLine()!!.toInt()

    var result: Int
    if(a==0 || b==0) result = a+b
    else {
        while (a != b) {
            if (a>b) a-=b else b-=a
        }
        result = a
    }
    print("Result: $result")
}