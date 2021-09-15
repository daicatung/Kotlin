package com.example.tungvv3kotlinlession1.kotlin2

import java.util.*

fun main(args: Array<String>){
    val scan = Scanner(System.`in`)

    print("input number a:")
    val a: Int = scan.nextInt()

    print("input number b:")
    val b: Int = scan.nextInt()

    print("input number c:")
    val c: Int = scan.nextInt()

    var max: Int = if ((a > b) && (a > c)) a else (if(b > c) b else c)

    max*=max
    var check1: Int = a*a + b*b
    var check2: Int = b*b + c*c
    var check3: Int = a*a + c*c

    var min: Int = if ((check1 < check2) && (check1 < check3)) check1 else (if(check2 < check3) check2 else check3)

    if(max != min)
        println("$a, $b, $c khong la 3 canh cua tam giac vuong")
    else
        println("$a, $b, $c la 3 canh cua tam giac vuong")
}