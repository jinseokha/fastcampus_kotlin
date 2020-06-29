package com.devseok95.fastcampus_kotlin.Kotlin

// 14. Collection
// -> list, set, map

fun main(args: Array<String>) {

    // 변경할 수 없음 (Immutable Collections)
    // List -> 중복 허용 함
    val numberList = listOf<Int>(1,2,3,3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])


    // Set -> 중복 허용 하지 않음
    //     -> 순서가 없음
    // 집합 속성 (동일한 값 적용 X)
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println()
    numberSet.forEach{
        println(it)
    }

    // Map -> Key, Value 방식으로 관리
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println()
    println(numberMap.get("one"))

    // Mutable Collection (변경가능)
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3, 4)
    println()
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberSet.add(10)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap)
}