package com.example.homeautomation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import okhttp3.*

class MainActivity2 : AppCompatActivity() {
    private val REQUEST_VIDEO_CAPTURE = 1
    var path = ""
    private lateinit var  pBar: ProgressBar
    var switch: String ?= null
    private lateinit var videoName: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        switch = intent.getStringExtra("switch")
        pBar = findViewById(R.id.progressBar)
        pBar.visibility=View.GONE
        Toast.makeText(
                this,
                "" + switch, Toast.LENGTH_SHORT
        ).show()
        var i = 1
        when (switch) {
            "Digit 0" -> {
                videoName= R.raw.handshape0.toString()
            }
            "Digit 1" -> {
                videoName= R.raw.handshape1.toString()
            }
            "Digit 2" -> {
                videoName= R.raw.handshape2.toString()
            }
            "Digit 3" -> {
                videoName= R.raw.handshape3.toString()
            }
            "Digit 4" -> {
                videoName= R.raw.handshape4.toString()
            }
            "Digit 5" -> {
                videoName= R.raw.handshape5.toString()
            }
            "Digit 6" -> {
                videoName= R.raw.handshape6.toString()
            }
            "Digit 7" -> {
                videoName= R.raw.handshape7.toString()
            }
            "Digit 8" -> {
                videoName= R.raw.handshape8.toString()
            }
            "Digit 9" -> {
                videoName= R.raw.handshape9.toString()
            }
            "Fan On" -> {
                videoName= R.raw.hfanon.toString()
            }
            "Fan Off" -> {
                videoName= R.raw.hfanoff.toString()
            }
            "Decrease Fan Speed" -> {
                videoName= R.raw.hdecreasefanspeed.toString()
            }
            "Increase Fan Speed" -> {
                videoName= R.raw.hincreasefanspeed.toString()
            }
            "Light Off" -> {
                videoName= R.raw.hlightoff.toString()
            }
            "Light On" -> {
                videoName= R.raw.hlighton.toString()
            }
            "Set Thermostat" -> {

            }
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }
        var simpleVideoView: VideoView?
        simpleVideoView = findViewById<View>(R.id.videoView) as VideoView
        simpleVideoView.setVideoURI(
                Uri.parse(
                        "android.resource://"
                                + packageName + "/" + videoName
                )
        )
        simpleVideoView.start()
        val record: Button = findViewById(R.id.button3Screen2)
        record.isVisible = false
        val replay: Button = findViewById(R.id.button2Screen2)
        replay.setOnClickListener {
            i++
            if (i > 3) {
                record.isVisible = true
            }
            simpleVideoView.start()
        }

        val back: Button = findViewById(R.id.button1Screen2)
        back.setOnClickListener {
            finish()
        }
        record.setOnClickListener {
            startRecording()
        }
    }

    fun startRecording() {
        Toast.makeText(this, "Video recording has started", Toast.LENGTH_SHORT).show()
        val takeVideoIntent = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
        takeVideoIntent.putExtra(MediaStore.EXTRA_DURATION_LIMIT, 3)
        startActivityForResult(takeVideoIntent, REQUEST_VIDEO_CAPTURE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            UploadService().upload(this, switch!!, data.data!!)
                .onCompleteListener(object : UploadService.UploadListener {
                    override fun onFail() {
                        this@MainActivity2.runOnUiThread(Runnable {
                            pBar.visibility = View.GONE
                            Toast.makeText(this@MainActivity2, "Failed to upload video", Toast.LENGTH_SHORT).show()
                        })
                    }
                    override fun onComplete() {
                        this@MainActivity2.runOnUiThread(Runnable {
                            pBar.visibility = View.GONE
                            Toast.makeText(this@MainActivity2, "Successfully uploaded the video", Toast.LENGTH_SHORT).show()
                            finish()
                        })
                    }
                })
        }

    }
}