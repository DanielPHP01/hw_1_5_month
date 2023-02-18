package com.example.hw_1_5_month

interface CounterView {
    fun showNewCount(count: Int)

    fun showToast(msg: String)

    fun changeTextColor(color: Int)
}