package com.example.uiactivity3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var listBooks:BookList
    lateinit var recycleView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleView = findViewById(R.id.recycleView)


        listBooks = BookList()
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = LibraryBookModelHolder(listBooks.bookList)

    }
}