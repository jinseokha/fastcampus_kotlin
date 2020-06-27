package com.devseok95.fastcampus_kotlin.Kotlin

// 08. 제어흐름
// - if, else

fun main(args: Array<String>) {
    val a: Int= 5
    val b: Int = 10

    // if - else 사용방법 (1)
    if (a > b) {
        println("a 가 b 보다 크다")
    } else {
        println("a 가 b 보다 작다")
    }

    // if - else 사용방법 (2)
    if (a > b) {
        println("a가 b 보다 크다")
    }

    // if - else if - else 사용 방법 (3)
    if (a > b) {
        println("a가 b보다 크다")
    } else if (a < b) {
        println("a가 b보다 작다")
    } else {
        println("둘다 아니다")
    }

    // 값을 리턴하는 if 사용방법
    val max = if(a > b) a  else b

    println()
    println(max)

}