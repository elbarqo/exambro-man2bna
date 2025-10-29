package com.man2bna.exambro

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Show a simple splash view with the logo and text
        val imageView = android.widget.ImageView(this)
        imageView.setImageResource(R.drawable.logo)
        imageView.scaleType = android.widget.ImageView.ScaleType.CENTER_INSIDE
        val textView = android.widget.TextView(this)
        textView.text = "Asesmen Madrasah Digital MAN 2 Banda Aceh"
        textView.textSize = 20f
        textView.setTextColor(android.graphics.Color.WHITE)
        textView.textAlignment = android.view.View.TEXT_ALIGNMENT_CENTER

        val layout = android.widget.LinearLayout(this)
        layout.orientation = android.widget.LinearLayout.VERTICAL
        layout.gravity = android.view.Gravity.CENTER
        layout.setBackgroundColor(android.graphics.Color.parseColor("#006400"))
        layout.addView(imageView)
        layout.addView(textView)

        setContentView(layout)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, 2000)
    }
}
