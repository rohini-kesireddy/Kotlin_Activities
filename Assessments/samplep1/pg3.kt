package com.example.samplep1

import java.util.*

class marks{


    fun total(sub1:Int,sub2:Int,sub3:Int):Int{
        return (sub1+sub2+sub3)
    }
    fun percentage(sub1:Int,sub2:Int,sub3:Int):Int{
        return (sub1+sub2+sub3)/3
    }
}
fun main(){
    var m =marks()
var sc=Scanner(System.`in`)
    var sub1 = sc.nextInt()
    var sub2 = sc.nextInt()
    var sub3 = sc.nextInt()
    var total:Int = m.total(sub1,sub2,sub3)
    var percentage:Int=m.percentage(sub1,sub2,sub3)
    println("Total marks of a student $total")
    println("percentage of a student $percentage")

}