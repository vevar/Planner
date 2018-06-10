package com.alexanderminyaev.android.planner

import android.annotation.SuppressLint
import android.app.FragmentManager
import android.app.FragmentTransaction
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.RelativeLayout


class ListTaskActivity : AppCompatActivity() {
    //TODO Make add task to RelativeLayout
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        createTimeList()

        setContentView(R.layout.activity_list_task)

        val relativeLayout = findViewById<RelativeLayout>(R.id.forTimeTask)
        relativeLayout.setOnTouchListener { v, m ->
            addTaskToList(m.x, m.y)
            true
        }

    }

    private fun createTimeList() {
        val fragManager: FragmentManager = fragmentManager
        val transaction: FragmentTransaction = fragManager.beginTransaction()

        for (i in 0..9) {
            transaction.add(R.id.day_markup, BlockTimeFragment("0$i:00"))
        }

        for (i in 10..23) {
            transaction.add(R.id.day_markup, BlockTimeFragment("$i:00"))
        }

        transaction.commit()
    }

    private fun addTaskToList(x : Float, y : Float){
        val blockBackSizeHeight : Int = R.dimen.background_block_height
        var timeStart : Float = y % blockBackSizeHeight
        val newTaskFragment : TimeTaskFragment = TimeTaskFragment()

    }



}
