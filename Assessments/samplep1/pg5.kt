package com.example.samplep1


fun fact(a:Int, r: (Int) -> Unit):Unit{
    var fact=1
    for(i in 1..a)
    {
        fact=fact*i
    }
    r(fact)
}
fun main()
{
    var r:(Int)->Unit={fact:Int ->println("Factorial is $fact") }
    var a=Integer.valueOf(readLine())
    fact(a,r)
}