package com.example.animations

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.View
import android.view.animation.AnticipateOvershootInterpolator

class SecondConstraintSet : AppCompatActivity() {

    private var showBigImage = false

    private val constraintSetBig = ConstraintSet()

    private val constraintSetSmall = ConstraintSet()

    private var rootLayout: ConstraintLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_constraint_set)

        rootLayout = findViewById(R.id.secondAnimation)
        constraintSetSmall.clone(rootLayout)
        constraintSetBig.load(this, R.layout.second_constraint_set_end)
    }

    fun toggleOnClick (view: View) {

        val transition = ChangeBounds()
        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 1200
        TransitionManager.beginDelayedTransition(rootLayout, transition)
        showBigImage = !showBigImage

        applyConfig()
    }

    private fun applyConfig() {
        if (showBigImage) {
            constraintSetBig.applyTo(rootLayout!!)
        } else {
            constraintSetSmall.applyTo(rootLayout!!)
        }
    }
}
