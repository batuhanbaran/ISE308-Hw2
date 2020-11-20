package com.example.ise308_hw2

class Student(override var name: String, override var surname: String, override var age: Int, override var gender: String):Person(name,surname, age, gender){ //here is the primary constructor

    private var student_id: Int? = 0
    private var gpa: Double? = 0.0
    private var takenCourseArray: Array<String> = arrayOf()

    constructor(name: String, surname: String, age: Int,  gender: String, stu_id: Int, courseArr: Array<String>, gpa: Double):this(name, surname, age, gender){ //secondary construtor

        this.student_id = stu_id
        this.takenCourseArray = courseArr
        this.gpa = gpa

    }

    override fun getInfo() { //we've override this fun from our base class

        println("Student $name $surname, $age, with number $student_id is created and $name has taken the following courses;")

        for (course in takenCourseArray){

            print("$course, ")
        }
    }

    open fun calcAcademicAchievement(){

        if (this.gpa!! > 2.99 && this.gpa!! < 3.50){

            print("$name $surname is honor student.")
        }

        else if (this.gpa!! > 3.49 && this.gpa!! < 4.00){

            print("$name $surname is high honor student.")
        }

        else{

            print("$name $surname has no academic achievement.")
        }
    }


}