package com.example.projet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Paint
import android.app.Activity
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.PixelFormat
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import  com.example.projet.R

class MainActivity : AppCompatActivity() {

    lateinit var drawingView2: DrawingView2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawingView2 = findViewById<DrawingView2>(R.id.vMain)
        drawingView2.setWillNotDraw(false) //efface ce qu'il y avait
        drawingView2.invalidate() //Appelle le onDraw
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) //remove le haut de l'écran(heure,batterie,etc..)
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION) //remove les boutons en bas de l'écran
        this.drawingView2.setZOrderOnTop(true)
        this.drawingView2.getHolder().setFormat(PixelFormat.TRANSLUCENT)

    }

    override fun onPause() {
        super.onPause()
        drawingView2.pause()
    }

    override fun onResume() {
        super.onResume()
        drawingView2.resume()
    }
}
