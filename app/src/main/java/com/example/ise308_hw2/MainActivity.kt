package com.example.ise308_hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        main()
    }
}

private fun main() {




    val takenLessons = arrayOf("ISE 308", "ISE 493", "ENG 301","SE 427","ISE 353","MATH 152","CEAC 105") //we've initalize our takenLessons array
    val givenCourses = arrayOf("ISE 308", "ISE 353","MATH 152") //we've initalize our givenCourses array

    val myFirstPerson = Person("James","Anderson",20, "Male") //we've created an object from class Person
    myFirstPerson.getInfo()

    val mySecondPerson = Person("Amy","Taylor",21, "Female")
    mySecondPerson.getInfo()


    val myFirstStudent = Student("James","Anderson",20,"Male",113451345,takenLessons,3.60) //we've created an object from class Student and passed our array
    myFirstStudent.getInfo()
    myFirstStudent.calcAcademicAchievement() //we 've got the returned value.

    print("\n")

    val mySecondStudent = Student("Amy","Taylor",20,"Female",456456456,takenLessons,3.25)
    mySecondStudent.getInfo()
    mySecondStudent.calcAcademicAchievement()

    print("\n")

    val myFirstInstructor = Instructor("Eddy","Simith",36,"Male",1,givenCourses,8000.0)
    myFirstInstructor.getInfo()

    print("\n")
    myFirstInstructor.setSalary(15000.0)

    print("\n")

    val mySecondInstructor = Instructor("Marry","Willson",28,"Female",1,givenCourses,5250.0)
    mySecondInstructor.getInfo()


}