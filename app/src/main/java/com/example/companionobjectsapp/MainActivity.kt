package com.example.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var mainLayout: ConstraintLayout
    lateinit var et: EditText
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainLayout = findViewById(R.id.main_layout)
        et = findViewById(R.id.et)
        btn = findViewById(R.id.button)

        btn.setOnClickListener {
            when{
                et.text.toString().equals("day",true) -> ChangeBackGround.change(Values.day, mainLayout)
                et.text.toString().equals("night",true) -> ChangeBackGround.change(Values.night, mainLayout)
            }
        }
    }

    class Values(){
        companion object{
            val day = 1
            val night = 0
        }
    }

    class ChangeBackGround(){
        companion object{
            fun change(mode: Int, view: View){
                when(mode){
                    1 -> view.setBackgroundResource(R.mipmap.day)
                    0 -> view.setBackgroundResource(R.mipmap.night)
                }
            }
        }
    }
}