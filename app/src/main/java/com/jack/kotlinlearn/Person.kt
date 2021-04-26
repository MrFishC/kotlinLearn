package com.jack.kotlinlearn

/**
 * @创建者 Jack
 * @创建时间 2021/4/17 15:52
 * @描述
 */
open class Person(val name : String,val age : Int){
    fun eat(){
        println(name + " is eating, He is " + age + " year old.")
    }
}