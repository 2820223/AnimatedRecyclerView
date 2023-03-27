package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.rv)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<Doctors>()

        // This loop will create 20 Views containing
        // the image with the count of view
//        for (i in 1..20) {
//            data.add((R.drawable.ic_baseline_folder_24, "Item " + i))
//        }
        data.add(Doctors(R.drawable.women,"Jane","Dentist","Colorado Public health organization"))
        data.add(Doctors(R.drawable.johnson,"Dr. Johnson","Cardiologist","Missisipi state hospital"))
        data.add(Doctors(R.drawable.amaly,"Miss Amaly","Orthopedist","RightStep company"))

        // This will pass the ArrayList to our Adapter
        val adapter = RecycleAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}