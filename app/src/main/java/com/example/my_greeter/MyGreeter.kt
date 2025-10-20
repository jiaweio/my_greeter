package com.example.my_greeter

/**
Date: 2025/10/20  20:38
author: DONG JIA WEI
简单的问候类：根据当前时间返回不同的问候语
 */

import java.util.Calendar
import java.util.TimeZone

class MyGreeter(
    private val timeProvider: () -> Int = {
        Calendar.getInstance(TimeZone.getDefault()).get(Calendar.HOUR_OF_DAY)
    }
) {

    /**
     * 基于当前时间返回问候语
     */
    fun greeting(): String = greetingByTime(timeProvider())

    /**
     * 返回对应字符串
     */
    private fun greetingByTime(hour: Int): String {
        return when (hour) {
            in 6..11 -> "Good morning"
            in 12..17 -> "Good afternoon"
            else -> "Good evening"
        }
    }
}