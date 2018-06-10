package com.alexanderminyaev.android.planner


import android.annotation.SuppressLint
import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * This class used for draw background of list of time
 *
 * @property time string of time
 */
class BlockTimeFragment() : Fragment() {


    private lateinit var time: String

    @SuppressLint("ValidFragment")
    constructor(time: String) : this() {
        this.time = time
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_block_time, container, false)
        val time: TextView = view.findViewWithTag("list_task_time")
        time.text = this.time

        return view
    }


}
