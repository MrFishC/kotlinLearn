package com.jack.kotlinlearn

/**
 * @创建者 Jack
 * @创建时间 2021/4/17 16:35
 * @描述 继承的使用
 */
class Student(val sno : String,val grade : Int,name : String,age : Int) : Person(name,age),Study{

    constructor(name : String,age : Int) : this("",0,name,age)

    constructor() : this("",0)

    override fun readBooks() {
        println(name + "is reading.")
    }

    override fun doHomeWorks() {
        println(name + "is doing homework.")
    }

    fun study(study: Study){
        study.readBooks()
        study.doHomeWorks()
    }
}