package com.example.samplep1

import java.util.*

class fibonacci{

    fun my(n:Int):Unit{
        var a=0
        var b=1
        var c:Int
        for(i in 0..n-1) {
            if (n == 0 || n == 1)
                println(1)
            else {
                println("$a")
                c = a + b
                a = b
                b = c
            }
        }

    }
}
fun main(){

    var f=fibonacci()

    var sc = Scanner(System.`in`)
    var n =sc.nextInt()
    f.my(n)




}