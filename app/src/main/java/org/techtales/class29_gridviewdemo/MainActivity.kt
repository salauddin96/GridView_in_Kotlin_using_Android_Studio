package org.techtales.class29_gridviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    private lateinit var gridView: GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridview)
        val courseList:ArrayList<Model> = ArrayList<Model>()

        courseList.add(Model("Team", R.drawable.teamwork))
        courseList.add(Model("Java", R.drawable.java))
        courseList.add(Model("Python", R.drawable.python))
        courseList.add(Model("Kotlin", R.drawable.kotlin))

        val adapter = Adapter(this,courseList)
        gridView.adapter = adapter

    }
}