package com.example.tungvv3kotlinlession1.kotlin2

import java.util.*

fun main(args: Array<String>){

    val scan = Scanner(System.`in`)
    println("input string:")
    var str:String = scan.next()

    println("input character:")
    var ch:Char = scan.next().single()
    var flag = false

    for (element in str) {
        if (ch == element){
            println("Ky tu $ch co nam trong chuoi $str")
            flag = true
            break
        }
    }
    if (!flag)
        println("Ky tu $ch khong nam trong chuoi $str")
}