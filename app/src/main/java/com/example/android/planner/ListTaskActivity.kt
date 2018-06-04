package com.example.android.planner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ScrollView

class ListTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var view : ConstraintLayout = ConstraintLayout(applicationContext)

//        var scrollView : ScrollView = ScrollView(applicationContext)
//        scrollView.width = ViewGroup.LayoutParams.MATCH_PARENT
//
//        var linearLayout : LinearLayout = LinearLayout(applicationContext)
//        linearLayout.orientation = LinearLayout.VERTICAL
//        linearLayout
        setContentView(R.layout.activity_list_task)
    }
}
