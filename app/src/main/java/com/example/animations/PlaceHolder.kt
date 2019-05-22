package com.example.animations

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.View
import android.view.animation.OvershootInterpolator
import kotlinx.android.synthetic.main.activity_place_holder.*

class PlaceHolder : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_holder)
    }

    fun oneOnClick (view: View) {
        setPlaceHolder(R.id.one)
    }

    fun twoOnClick (view: View) {
        setPlaceHolder(R.id.two)

    }

    fun threeOnClick (view: View) {
        setPlaceHolder(R.id.three)

    }

    fun fourOnClick (view: View) {
        setPlaceHolder(R.id.four)

    }

    private fun setPlaceHolder(id: Int) {
        val transition = ChangeBounds()
        transition.interpolator = OvershootInterpolator()
        transition.duration = 400
        TransitionManager.beginDelayedTransition(placeholderLayout, transition)
        placeHolder.setContentId(id)
    }
}
