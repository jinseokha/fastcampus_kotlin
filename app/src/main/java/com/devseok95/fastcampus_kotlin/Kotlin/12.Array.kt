package com.devseok95.fastcampus_kotlin.Kotlin

// 12. 배열

// 배열이 필요한 이유
// - 그룹(모음집)이 필요할 때

fun main(array: Array<String>) {

    // 배열 생성(1)
    var number : Int = 10
    var group1 = arrayOf<Int>(1,2,3,4,5)

    println(group1 is Array)
    
    // 배열 생성(2)
    // 타입 작성 생략하는 경우 자동으로 들어와있는 10의 값인 Int로 됨
    // arrayOf은 타입안적을경우 아무타입 다 됨
    var number1 = 10
    var group2 = arrayOf(1,2,3.5,"Hello")

    // Index 란
    // -> 순서
    // [1, 2, 3, 4, 5]
    // "0"부터 시작
    // index[0] -> 1
    // index[1] -> 2

    // 배열 값 꺼내는 방법(1)
    val t1 = group1.get(0)
    val t2 = group1.get(4)
    println(t1)
    println(t2)

    // 배열 값 꺼내는 방법(2)
    val t3 = group1[0]
    println()
    println(t3)

    // 배열 값 바꾸는 방법(1)
    group1.set(0, 100) // 0번째 값을 100으로 바꿈
    println(group1[0])

    // 배열 값 바꾸는 방법(2)
    group1[0] = 200 // 0번째 값을 200으로 바꿈
    println(group1[0])

}