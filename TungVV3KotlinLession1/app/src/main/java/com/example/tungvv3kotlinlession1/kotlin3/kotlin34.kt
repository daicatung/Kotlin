package com.example.tungvv3kotlinlession1.kotlin3

fun main(args: Array<String>){

    print("Enter month:")
    var month: Int = readLine()!!.toInt()

    when(month){
        1, 2, 3 -> print("month $month belong 1")
        4, 5, 6 -> print("month $month belong 2")
        7, 8, 9 -> print("month $month belong 3")
        10, 11, 12 -> print("month $month belong 4")
        else -> print("month must belong 1 to 12")
    }
}