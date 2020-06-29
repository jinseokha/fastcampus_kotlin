package com.devseok95.fastcampus_kotlin.Kotlin

fun main(array: Array<String>) {
    val array = arrayOf<Int>(1,2,3)

    // get, set
    val number = array.get(0)
    println(number)

    //val number2 = array.get(100) // 인덱스에 주의 해야함

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

    //array.set(100, 100) // error

    // Array의 Bounds
    // - 처음 만들때 결정 된다

    // Array 생성 방법 (3)
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('a','b','c') // char -> '', string -> ""
    val a3 = doubleArrayOf(1.2, 100.345)
    val a4 = booleanArrayOf(true, false, true, false)

    // Array 생성 방법 (4) -> lambda를 활용한 방법 (알아두면 좋음)

    // 인덱스 전부 0으로 들어감
    var a5 = Array(10, { 0 })
    var a6 = Array(5, {1;2;3;4;5;})


}