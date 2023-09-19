package org.techtales.class29_gridviewdemo

class Model (private var course_name:String, private var course_img:Int){
    fun getCourse_name():String{
        return course_name
    }
    fun getCourse_img(): Int {
        return course_img
    }

    fun setCourse_name() {
         this.course_name = course_name
    }

    fun setCourse_img() {
        this.course_img = course_img
    }
}