package com.devseok95.fastcampus_kotlin.Kotlin


// 1번
// List를 두개 만든다
// 첫번째 List에는 0 부터 9 까지 값을 넣는다. (반복문 사용)
// 두뻔재 List에는 첫번째 List의 값을 하나씩 확인 후
// 짝수면 True 홀수면 False를 넣어준다.

// 2번
// 학점 구한다
// 80 - 90 -> A
// 70 - 79 -> B
// 60 - 69 -> C

// 3번
// 전달 받은 숫자의 각 자리 수의 합을 구하자
// 조건 : 전달 받은 숫자는 무조건 두 자리 숫자이다.

// 4번
// 구구단을 출력하자

fun main(array: Array<String>) {
    first()
    second(89)
    third(89)
    gugudan()

}

fun first() {
    val list1 = MutableList(9, {0})
    val list2 = MutableList(9, {true} )

    for (i in 0..8) {
        list1[i] = i + 1
    }

    /*for (i in 1..9) {
        list1[i-1] = i
    }*/

    println(list1)

    list1.forEachIndexed { index, value ->
        if(value % 2 == 0) {
            // 짝수
            list2[index] = true
        } else {
            // 홀수
            list2[index] = false
        }
    }
    println(list2)
}

fun second(score: Int): String {
    var result: String ="F"
    when(score) {
        in 90..100 -> {
            result = "A"
        }
        in 80..89 -> {
            result = "B"
        }
        in 70..79 -> {
            result = "C"
        }
        else ->{
            result = "F"
        }
    }
    return result
}

fun third(number: Int): Int {
    val a: Int = number / 10
    val b: Int = number % 10

    //89 -> 8 + 9

    return a + b
}


fun gugudan() {
    for (x in 1..9) {
        for (y in 1..9) {
            println("$x X $y = ${x * y}")
        }
    }
}





