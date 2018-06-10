package com.alexanderminyaev.android.planner


import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alexanderminyaev.android.planner.util.Time


class TimeTaskFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_time_task, container, false)
    }

    fun setTime(startTime : Time){

    }

}
