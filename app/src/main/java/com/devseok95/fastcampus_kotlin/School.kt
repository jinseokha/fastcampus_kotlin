package com.devseok95.fastcampus_kotlin

import io.realm.RealmObject


open class School : RealmObject() {
    var name: String? = null
    var location: String? = null
}