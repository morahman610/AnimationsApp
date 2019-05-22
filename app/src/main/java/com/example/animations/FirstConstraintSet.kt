package com.example.animations

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet
import android.transition.TransitionManager
import android.view.View

class FirstConstraintSet : AppCompatActivity() {

    private var showBigImage = false

    private val constraintSetBig = ConstraintSet()

    private val constraintSetSmall = ConstraintSet()

    private var rootLayout: ConstraintLayout? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_constraint_set)

        rootLayout = findViewById(R.id.startAnimation)

        constraintSetSmall.clone(rootLayout)

        constraintSetBig.load(this, R.layout.first_constraint_set_end)
    }

    fun toggleOnClick (view: View) {

        TransitionManager.beginDelayedTransition(rootLayout!!)

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
