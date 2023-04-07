package com.example.recyclerviewkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private var arrContacts = ArrayList<ContactModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerContact)
        recyclerView.layoutManager = LinearLayoutManager(this)
        arrContacts.add(ContactModel(R.drawable.ic_launcher_background, "A", "9012034759"))
        arrContacts.add(ContactModel(R.drawable.ic_launcher_foreground, "B", "9012034760"))
        arrContacts.add(ContactModel(R.drawable.ic_launcher_background, "C", "9012034761"))
        arrContacts.add(ContactModel(R.drawable.recyclerview, "D", "9012034762"))
        arrContacts.add(ContactModel(R.drawable.ic_launcher_background, "E", "9012034763"))
        arrContacts.add(ContactModel(R.drawable.ic_launcher_foreground, "F", "9012034764"))
        arrContacts.add(ContactModel(R.drawable.ic_launcher_background, "G", "9012034765"))
        arrContacts.add(ContactModel(R.drawable.recyclerview, "H", "9012034766"))
        arrContacts.add(ContactModel(R.drawable.ic_launcher_background, "I", "9012034767"))
        arrContacts.add(ContactModel(R.drawable.ic_launcher_foreground, "J", "9012034768"))
        val adapter = RecyclerContactAdapter(this, arrContacts)
        recyclerView.adapter = adapter
    }
}