package com.example.projet

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF

class Parois2(x1: Float, y1: Float, x2: Float, y2: Float): Blocs2(x1, y1 ,x2,y2){
    override val color = Color.BLACK

    override fun draw(canvas: Canvas) {
        BlocPaint.color = color
        canvas.drawRect(bloc, BlocPaint)
    }

    override fun Reactionballe(b: Balle2) {
        if (RectF.intersects(b.r, this.bloc)){
            if(this.largeur>this.longueur){
                b.changeDirection(true)
            }
            else{
                b.changeDirection(false)
            }
        }
    }




}