package com.example.androidlab

fun main(){
    var data = 10
    val result = if(data>0){
        println("data > 0")
        true
    }else{
        println("data <= 0")
        false
    }
    println(result)

    obj.data = 30
    obj.some()
}

open class Super(){
    open var data = 10
    open fun some(){
        println("I am super some(): $data")
    }
}

val obj = object: Super(){
    override var data = 20
    override fun some(){
        println("I am object some(): $data")
    }
}