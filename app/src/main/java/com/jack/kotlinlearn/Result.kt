package com.jack.kotlinlearn

import java.lang.Exception
import java.lang.IllegalArgumentException

/**
 * @创建者 Jack
 * @创建时间 2021/4/25 17:43
 * @描述 密封类
 */

sealed class Result{
    class Success(val msg : String):Result()
    class Failed(val error : Exception):Result()

    fun getResultMsg(result: Result) = when(result){
        is Success -> result.msg
        is Failed -> "Error is ${result.error.message}"
    }
}

//    fun getResultMsg(result: Result) = when(result){
//        is Success -> result.msg
//        is Failed -> result.error.message
//        else -> throw IllegalArgumentException()
//    }
