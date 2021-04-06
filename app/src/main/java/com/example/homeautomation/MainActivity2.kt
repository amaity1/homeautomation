package com.example.homeautomation

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.VideoView
import androidx.core.view.isVisible

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val switch= intent.getStringExtra("switch")
        Toast.makeText(this,
                        "" + switch, Toast.LENGTH_SHORT).show()
        var i=1
        var simpleVideoView: VideoView? = null
        simpleVideoView = findViewById<View>(R.id.videoView) as VideoView
        simpleVideoView!!.setVideoURI(Uri.parse("android.resource://"
                + packageName + "/" + R.raw.shape1))
        simpleVideoView!!.start()
        val record:Button= findViewById(R.id.button3Screen2)
        record.isVisible = false
        val replay:Button= findViewById(R.id.button2Screen2)
        replay.setOnClickListener {
            i++
            if(i>3){
                record.isVisible= true
            }
            simpleVideoView!!.start()
        }

        val back:Button= findViewById(R.id.button1Screen2)
        back.setOnClickListener {
            finish()
        }

    }
}