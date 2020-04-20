package com.example.studentinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstStudent = Student()
        firstStudent.firstName = "Nika"
        firstStudent.lastName = "Rukhadze"
        firstStudent.gender = "Male"
        firstStudent.age = 23
        firstStudent.id = "42001000112"
        firstStudent.gpa = "2.5"

        firstNameTextView.text=firstStudent.firstName
        lastNameTextView.text=firstStudent.lastName
        genderTextView.text=firstStudent.gender
        ageTextView.text=firstStudent.age.toString()
        idTextView.text=firstStudent.id
        gpaTextView.text=firstStudent.gpa
    }
}
