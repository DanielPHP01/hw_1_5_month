package com.example.hw_1_5_month

import android.graphics.Color


class Presenter {
    private val model = Model()
    private lateinit var counterView: CounterView

    fun increment() {
        model.increment()
        counterView.showNewCount(model.count)

        if (model.count == 10) {
            counterView.showToast("Поздравляем")
        }
        updateTextColor()
    }

    fun decrement() {
        model.decrement()
        counterView.showNewCount(model.count)
        if (model.count == 10) {
            counterView.showToast("Поздравляем")
        }
        updateTextColor()
    }

    fun filledCounterView(counterView: CounterView) {
        this.counterView = counterView
    }

    private fun updateTextColor() {
        if (model.count >= 15) {
            counterView.changeTextColor(Color.GREEN)
        } else {
            counterView.changeTextColor(Color.BLACK)
        }
    }
}