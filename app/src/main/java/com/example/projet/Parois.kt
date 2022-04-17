package com.example.projet

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Color



class Parois(x1: Float, y1: Float, x2: Float, y2: Float): Blocs(x1, y1, x2, y2){


    fun draw(canvas: Canvas?) {
        paint.color = Color.BLACK
        canvas?.drawRect(r,paint)
    }

    override fun gereBalle(b: Balle) { //C'est la bonne manière de gérer la balle? ou on utilise ce qui est dans blocs.kt
        if (RectF.intersects(this.r,b.r )){
            if (b.dx ==0 ){
                b.changeDirection(true)
            }
            else if (b.dy ==0){
                b.changeDirection(false)
            }
        }
    }
}