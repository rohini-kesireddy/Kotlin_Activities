package com.example.samplep1

class PrimeNumber{
    fun Prime(number:Int){
        var count = 1
        var i=2
        var j:Int
        var flag:Int
        while (count <= number){
            flag = 0
            for (j in  2..i/2){
                if(i%j == 0)
                {
                    flag = 1
                    break
                }
            }
            if(flag == 0){
                println(i)
                count++
            }
            i++
        }
    }
}

fun main(){
    PrimeNumber().Prime(Integer.valueOf(readLine()))
}