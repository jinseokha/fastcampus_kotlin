package com.devseok95.fastcampus_kotlin.Kotlin

// 01 변수

// 변수 선언 방법
// var/val 변수명 = 값
// Variable / Value

// Variable = 원하는 것을 넣을 수 있음
// Value = 한번 넣으면 바꿀수 없음

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args:Array<String>) {

    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Bye"
    point = 10.4

    println(num)
    println(hello)
    println(point)
    println(fix)

    // fix = 500 : error

}