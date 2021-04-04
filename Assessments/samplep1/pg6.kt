package com.example.samplep1


import java.util.*
fun  greatestandsmallest(a:ArrayList<Int>,n:Int,r: (Int,Int) -> Unit):Unit
{
    var small=a.get(0)
    var large=a.get(0)
    for(i in 0..n-1)
    {
        if(a[i]>large)
            large=a[i]
        if(a[i]<small)
            small=a[i]
    }
    r(large,small)

}
fun main()
{
    var r:(Int,Int)->Unit={a,b:Int->println("Greatest number is $a and smallest number is $b") }
    var sc=Scanner(System.`in`)
    var n=sc.nextInt()
    var l1=ArrayList<Int>()
    for(i in 0..n-1)
    {
        l1.add(sc.nextInt())
    }
    greatestandsmallest(l1,n,r)
}

