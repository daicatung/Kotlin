package com.example.tungvv3kotlinlession1.kotlin3

fun main(args: Array<String>){
    var year: Int
    do{
        println("input year:")
        year = readLine()!!.toInt()
    }while (year < 0)

    var check: Boolean = (((year % 4 == 0) && (year % 100 != 0)) ||
            (year % 400 == 0));

    if (check)
        print("Year $year is leap year")
    else
        print("Year $year is not leap year")
}