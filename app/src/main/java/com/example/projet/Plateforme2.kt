package com.example.projet
import android.graphics.*

import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import android.graphics.Color
import android.view.MotionEvent

class Plateforme2(x1:Float, y1:Float, x2:Float, y2:Float, var vitesse : Float): Blocs2(x1, y1, x2, y2) {
    override val color = Color.BLUE
    // var dx : Int
    // var dy : Int

    /* override fun Reactionballe(b: Balle) {
        super.Reactionballe(b)
    }

     */


    override fun draw(canvas: Canvas) {
        BlocPaint.color = color
        if (this.OnScreen == true){
            canvas.drawRect(bloc, BlocPaint)
        }
    }




}