package com.example.homeautomation


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinnerView)
        val languages = resources.getStringArray(R.array.spinnerItems)
        val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, languages)
        spinner.adapter=adapter
        spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>,
                                        view: View, position: Int, id: Long) {
                when (languages[position]) {
                    "Digit 0" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 0")
                    }
                    "Digit 1" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 1")
                    }
                    "Digit 2" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 2")
                    }
                    "Digit 3" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 3")
                    }
                    "Digit 4" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 4")
                    }
                    "Digit 5" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 5")
                    }
                    "Digit 6" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 6")
                    }
                    "Digit 7" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 7")
                    }
                    "Digit 8" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 8")
                    }
                    "Digit 9" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 9")
                    }
                    "Fan On" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Fan On")
                    }
                    "Fan Off" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Fan Off")
                    }
                    "Decrease Fan Speed" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Decrease Fan Speed")
                    }
                    "Increase Fan Speed" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Increase Fan Speed")
                    }
                    "Light Off" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Light Off")
                    }
                    "Light On" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Light On")
                    }
                    "Set Thermostat" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Set Thermostat")
                    }
                    else -> { // Note the block
                        print("x is neither 1 nor 2")
                    }
                }
                startActivity(intent)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // write code to perform some action
            }
        }
    }


}
