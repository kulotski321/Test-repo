package com.example.cf.testapplications

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun printSum(a: Int, b:Int){
        println("sum of $a and $b is ${a+b}")
    }
    fun main(args: Array<String>){
        printSum(-1,8)

        val num1: Int = 1
        val num2 =2
        val num3: Int
        num3 = 3

        println(" $num1, $num2, and $num3")

        var x = 5
        x += 1
    }
    fun stringTemplates(){
        var a = 1
        val s1 = "a is $a"

        a = 2
        val s2 = "${(s1.replace("is","was"))},but now is $a"
    }

}
