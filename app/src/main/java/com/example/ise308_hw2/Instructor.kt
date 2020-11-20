package com.example.ise308_hw2

import kotlin.math.roundToInt

class Instructor(override var name: String, override var surname: String, override var age: Int, override var gender: String):Person(name,surname,age,gender){

    private var instructor_id: Int? = 0
    public var instructorSalary: Double? = 0.0
    private var givenCourseArray: Array<String> = arrayOf()

    constructor(name: String, surname: String, age: Int, gender: String, ins_id: Int, courseArr: Array<String>, salary: Double):this(name, surname, age, gender){

        this.instructorSalary = salary
        this.instructor_id = ins_id
        this.givenCourseArray = courseArr

    }


    override fun getInfo() {

        println("Instructor $name $surname, $age, with number $instructor_id is created and $name has ${instructorSalary?.roundToInt()}$ and given the following courses;")

        for (course in givenCourseArray){

            print("${course}, ")
        }
    }

    fun setSalary(_salary: Double) {

        this.instructorSalary = _salary

        print("Instructor's salary has updated with ${_salary?.roundToInt()}$")

    }

    fun getSalary(): Double? {

        return this.instructorSalary
    }

}