package com.example.animations

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun constraintAnimation(view: View) {

        val intent: Intent = Intent(this, FirstConstraintSet::class.java)
        startActivity(intent)
    }

    fun secondConstraintAnimation(view: View) {

        val intent: Intent = Intent(this,SecondConstraintSet::class.java)
        startActivity(intent)
    }

    fun thirdAnimationOnClick(view: View) {
        val intent: Intent = Intent(this,PlaceHolder::class.java)
        startActivity(intent)
    }
}
