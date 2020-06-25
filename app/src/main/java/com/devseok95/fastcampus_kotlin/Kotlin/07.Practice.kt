package com.devseok95.fastcampus_kotlin.Kotlin

fun main(array: Array<String>) {

    var a = 10 + 1
    var b = 10 - 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    // 대입 연산자
    val f = 5
    //val 5 = f

    println()
    // 복합 대입 연산자
    a += 10
    println(a)
    b -= 10
    println(b)
    c *= 3
    println(c)
    d /= 4
    println(d)
    e %= 2
    println(e)

    //증감 연산자
    a++
    b--
    println()
    println(a)
    println(b)

    //비교 연산자
    var g = a > b
    var h = a == b
    val l = g != h
    println()
    println(g)
    println(h)
    println(l)


    //논리
    var i = !h
    val j = h && i
    val k = h || i
    println()
    println(i)
    println(j)
    println(k)
    
}