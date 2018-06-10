package com.alexanderminyaev.android.planner.util.throwable

class WrongValueException(val name : String, val value : Any?) : Throwable() {
    override val message: String?
        get() = "WrongValueException: wrong value of $name ( $value ) "
}