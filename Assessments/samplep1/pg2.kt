package com.example.samplep1

import java.util.*
fun main() {
    var sc = Scanner(System.`in`)
    var pi: Double = 3.14
    var radius: Float = sc.nextFloat()
    var perimeter = sc.nextDouble()

    var aoc = (pi * radius * radius)
    var poc = (2*pi*radius)
     var los = perimeter/4

    println("Area of a circle is $aoc")
    println("Perimeter of a circle is $poc")
    println("Length of the side of a square is $los")
}