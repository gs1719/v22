package com.example.v22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val taskList = arrayListOf<String>()

        taskList.add("Task1 .....")
        taskList.add("Task2 .....")
        taskList.add("Task3 .....")
        taskList.add("Task4 .....")
        taskList.add("Task5 .....")
        taskList.add("Task6 .....")

        val adapterForMyListView = ArrayAdapter(this,android.R.layout.simple_list_item_checked,taskList)
        /*
        * datasource(database here array)<--------- Adapter <--------- (View here Adapter)
        *
        * */
        //list view me data jor diya hai array adapter wala
        listView.adapter = adapterForMyListView

        listView.setOnItemClickListener { _,view,_,_->
            val text = "Clicked on item: " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

    }
}
