package com.example.samplep1

import java.util.*

class leapyear{

    fun leap(year:Int):Unit{
         if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
        {
           println ("Given year is a leap year")
        }
        else
        {
            println("Given year is not a leap year")
        }
    }
}
fun main(){
    var ly=leapyear()
    var sc = Scanner(System.`in`)
    var year=sc.nextInt()
    ly.leap(year)
    //var sr:String=ly.leap(year)
   // println(sr)


}