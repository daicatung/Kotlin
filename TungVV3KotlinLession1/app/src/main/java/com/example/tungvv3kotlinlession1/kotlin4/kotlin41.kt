package com.example.tungvv3kotlinlession1.kotlin4

fun isPrime(n: Int): Boolean{
    for (i in 2..n / 2) {
        // condition for nonprime number
        if (n % i == 0) {
            return false
            break
        }
    }
    return true
}

fun main(args: Array<String>){
    print("Enter number:")
    var num = readLine()!!.toInt()

    for (i in 1..num/2){
        if (isPrime(i)){
            if (isPrime(num - i))
                println("$num = $i + ${num-i}")
        }
    }
}