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
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Digit 1" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 1")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Digit 2" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 2")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Digit 3" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 3")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Digit 4" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 4")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Digit 5" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 5")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Digit 6" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 6")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Digit 7" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 7")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Digit 8" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 8")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Digit 9" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Digit 9")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Fan On" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Fan On")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Fan Off" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Fan Off")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Decrease Fan Speed" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Decrease Fan Speed")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Increase Fan Speed" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Increase Fan Speed")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Light Off" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Light Off")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Light On" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Light On")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }
                    "Set Thermostat" -> {
                        intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("switch","Set Thermostat")
                        Toast.makeText(this@MainActivity,
                                getString(R.string.screen1Text) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
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
