package com.example.samplep1

import java.util.*

class billamount{
    fun amount(quant:Int,unitprice:Int):Int{
        return (quant*unitprice)

    }
    fun discount(quant: Int,unitprice: Int):Int{

        return (quant*unitprice*15)/100


    }
}
fun main(){

    var ba=billamount()
    var sc = Scanner(System.`in`)
    var quant= sc.nextInt()
    var unitprice =sc.nextInt()
    var amount :Int = ba.amount(quant,unitprice)
    var discount :Int=ba.discount(quant,unitprice)
    println("Final bill amount is $amount ")
    println("Discount amount is $discount")
    println()

}