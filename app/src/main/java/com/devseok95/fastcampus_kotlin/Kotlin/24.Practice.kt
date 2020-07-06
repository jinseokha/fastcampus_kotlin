package com.devseok95.fastcampus_kotlin.Kotlin

fun main(array: Array<String>) {

    val night = Night(20, 4)
    val monster = Monster(15, 3)

    night.attack(monster)
    monster.attact(night)


    
}

class Night(private var hp: Int, private var power: Int) {

    fun attack(monster: Monster) {
        monster.defense(power)
    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            heal()
            println("몬스터 현재 체력은 $hp 입니다")
        } else
            println("몬스터가 죽었습니다.")
    }

    private fun heal() {
        // 공격을 당했을떄 죽지 않았다면 힐을 한다
        hp += 3
    }
}

class Monster(private var hp: Int, private var power: Int) {

    fun attact(night: Night) {
        night.defense(power)
    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0)
            println("몬스터 현재 체력은 $hp 입니다")
        else
            println("몬스터가 죽었습니다.")
    }

}