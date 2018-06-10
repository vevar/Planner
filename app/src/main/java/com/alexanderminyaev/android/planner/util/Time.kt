package com.alexanderminyaev.android.planner.util

import com.alexanderminyaev.android.planner.util.throwable.WrongValueException

/**
 *  This class use for a time
 *
 *  @param h hours
 *  @param m minutes
 */
class Time(h: Int, m: Int) {

    companion object {
        val MINUTES_HOUR: Int = 60
    }

    var hours: Int = 0
        set(h) {
            if (h in 0..23)
                field = h
            else
                throw WrongValueException("1 param", h)
        }
    private var minutes: Int = 0
        set(m) {
            if (m in 0..60)
                field = m
            else
                throw WrongValueException("2 param", m)
        }

    init {
        hours = h
        minutes = m

    }

    fun getHoursToString(): String {
        return if (hours < 10) {
            "0$hours"
        } else {
            hours.toString()
        }
    }

    fun getMinutesToString() : String{
        return if(minutes < 10)
            "0$minutes"
        else
            minutes.toString()
    }


    fun getTime(): Int {
        return if (hours == 0)
            minutes
        else
            hours * MINUTES_HOUR + minutes
    }
}