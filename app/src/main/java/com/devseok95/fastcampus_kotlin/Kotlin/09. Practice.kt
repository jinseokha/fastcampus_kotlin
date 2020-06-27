package com.devseok95.fastcampus_kotlin.Kotlin


fun main(args:Array<String>) {
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 110) {
        println("b plus c equal 100")
    } else {
        println("b plus c is not 110")
    }

    // 엘비스 연산자 (null 대응 문법 지원 요소)
    // (많이 사용할수록 좋음)
    val number: Int? = null
    val number2 = number ?: 10

    println()
    println(number2)

    val num1: Int = 10
    val num2: Int = 20
    val max = if (num1 > num2) {
        num1
    } else if (num1 == num2){
        num2
    } else {
        30
    }



}