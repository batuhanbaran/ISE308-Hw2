package com.example.ise308_hw2

open class Person(open val name: String, open val surname: String, open val age: Int, open val gender: String) {



    open fun getInfo(){

        println("$name $surname, $age, is years old and gender is $gender.")

    }

}

