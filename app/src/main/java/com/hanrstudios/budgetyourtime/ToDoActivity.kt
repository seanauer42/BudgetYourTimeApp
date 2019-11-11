package com.hanrstudios.budgetyourtime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_to_do.*

class ToDoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do)

        toDoActivity_hoursMinutes.setOnCheckedChangeListener { buttonView, isChecked ->
            if (toDoActivity_hoursMinutes.isChecked){
                toDoActivity_hoursMinutes.text = "HOURS"
            } else {
                toDoActivity_hoursMinutes.text = "MINUTES"
            }
        }
//        toDoActivity_hoursMinutes.setOnCheckedChangeListener { toDoActivity_hoursMinutes, isChecked -> toDoActivity_hoursMinutes.text = "hours" }
        }
    }



