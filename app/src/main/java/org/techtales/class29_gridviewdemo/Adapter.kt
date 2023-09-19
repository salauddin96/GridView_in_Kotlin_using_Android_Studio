package org.techtales.class29_gridviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter(context: Context, courseList: ArrayList<Model>) : ArrayAdapter<Model?>(context, 0,
    courseList!! as List<Model?>
){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var listItemView = convertView
        if (listItemView==null){
            listItemView = LayoutInflater.from(context).inflate(R.layout.custom_layout, parent, false)
        }
        val courseModel:Model? = getItem(position)
        val courseName = listItemView!!.findViewById<TextView>(R.id.name)
        val courseImage = listItemView!!.findViewById<ImageView>(R.id.teamImg)

        courseName.setText(courseModel!!.getCourse_name())
        courseImage.setImageResource(courseModel!!.getCourse_img())

        return listItemView
    }
}