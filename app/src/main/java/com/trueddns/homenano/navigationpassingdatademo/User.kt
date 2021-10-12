package com.trueddns.homenano.navigationpassingdatademo

data class User(val id: Int, val name: String) {
    val description: String get() = "$name has an ID of $id"
}
