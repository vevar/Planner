package com.example.android.planner

import android.app.FragmentManager
import android.app.FragmentTransaction
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class ListTaskActivity : AppCompatActivity() {
    //TODO Add fragments BlockTimeFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        createTimeList()

        setContentView(R.layout.activity_list_task)
    }

    private fun createTimeList(){
        val fragManager : FragmentManager = fragmentManager
        val transaction : FragmentTransaction = fragManager.beginTransaction()
        val strMinutes : String = ":00"
        var time : String
        for (i in 0..23){
            if (i < 10){
                time = "0$i:00"
            }
            else{
                time = "$i:00"
            }
            transaction.add(R.id.day_markup, BlockTimeFragment(time))
        }
        transaction.commit()
    }

}
