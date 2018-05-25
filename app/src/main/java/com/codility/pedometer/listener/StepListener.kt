package com.codility.pedometer.listener

/**
 * Created by Govind on 05/25/2018.
 */
interface StepListener {
    fun step(timeNs: Long)
}