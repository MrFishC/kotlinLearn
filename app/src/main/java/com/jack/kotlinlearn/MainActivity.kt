package com.jack.kotlinlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ifFunction(1,3)
//        whenFunction1("Tome1")

//        main();

//        createList()

//        createMutableList()

        lambdaString()
        lambdaString1()

        doStudy(null)

    }

    fun stringFunction(string: String){

    }

    fun doStudy(study: Study?) {
        study?.readBooks()
        study?.doHomeWorks()
    }

    fun lambdaString(){
        val list = listOf<String>("apple","orange","banana","pear","watermelon")
        var maxLengthFruit = ""
        for(fruit in list){
            if(fruit.length > maxLengthFruit.length){
                maxLengthFruit = fruit
            }
        }
        println(" max fruit lenght is " + maxLengthFruit)
    }

    fun lambdaString1(){
        val list = listOf<String>("apple","orange","banana","pear","watermelon")
        var maxLengthFruit = list.maxBy { it.length }
        println(" max fruit lenght is " + maxLengthFruit)
    }

    fun lambdaString3(){
        val list = listOf<String>("apple","orange","banana","pear","watermelon")
        val lamnda = {fruit : String -> fruit.length}
        val maxLengthFruit = list.maxBy(lamnda)
    }

    fun lambdaString4(){
        val list = listOf<String>("apple","orange","banana","pear","watermelon")
        val maxLengthFruit = list.maxBy({fruit : String -> fruit.length})
    }

    fun lambdaString5(){
        val list = listOf<String>("apple","orange","banana","pear","watermelon")
        val maxLengthFruit = list.maxBy(){fruit : String -> fruit.length}
    }

    fun lambdaString6(){
        val list = listOf<String>("apple","orange","banana","pear","watermelon")
        val maxLengthFruit = list.maxBy{fruit : String -> fruit.length}
    }

    fun lambdaString7(){
        val list = listOf<String>("apple","orange","banana","pear","watermelon")
        val maxLengthFruit = list.maxBy{fruit -> fruit.length}
    }

    fun lambdaString8(){
        val list = listOf<String>("apple","orange","banana","pear","watermelon")
        val maxLengthFruit = list.maxBy{it.length}
    }

    fun createList(){
        val list = listOf<String>("apple","orange","banana","pear")
        for(fruit in list){
            println(" 水果 " + fruit)
        }
    }

    fun createMutableList(){
        val list = mutableListOf<String>("apple","orange","banana","pear")
        for(fruit in list){
            println(" 水果 " + fruit)
        }
    }

    fun ifFunction(num1 : Int,num2 : Int) = if(num1 > num2) num1 else num2

    fun whenFunction1(name : String) : String{
        return when(name){
            "Tome1" -> "11"
            "Tome3" -> "13"
            "Tome5" -> "15"
            "Tome7" -> "17"
            else -> "10"
        }
    }

    fun whenFunction2(name : String) = when(name) {
        "Tome1" -> "11"
        "Tome3" -> "13"
        "Tome5" -> "15"
        "Tome7" -> "17"
        else -> "10"
    }

    fun whenFunction3(name : String) = when{
        name == "Tome1" -> "11"
        name == "Tome3" -> "13"
        name == "Tome5" -> "15"
        name == "Tome7" -> "17"
        else -> "10"
    }

    fun forInFunction(){
        for(i in 2..10){
            println(i)
        }
    }

    fun main(){
        val p = Person("Jack",18);
        p.eat()

        val s = Student("007",3)
        s.eat()

        Singleton.singletonTest()
    }

}