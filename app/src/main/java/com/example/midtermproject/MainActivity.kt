package com.example.midtermproject

import android.graphics.Color.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_open = findViewById(R.id.button5) as Button
        // set on-click listener
        btn_open.setOnClickListener{
            val snackbar = Snackbar.make(it,"Opening an App", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
            snackbar.setActionTextColor(WHITE)
            val snackBarView = snackbar.view
            snackBarView.setBackgroundColor(GREEN)
            snackbar.show()
        }

        //Getting Button
        val btn_uninst = findViewById(R.id.button6) as Button
        //setting Event Listener
        btn_uninst.setOnClickListener{
            val snackbar = Snackbar.make(it,"Uninstalling The App", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    snackbar.setActionTextColor(WHITE)
            val snackBarView = snackbar.view
            snackBarView.setBackgroundColor(GREEN)
            snackbar.show()
        }

        val btn_travel = findViewById(R.id.travelBtn) as TextView

        btn_travel.setOnClickListener{
            val snackbar = Snackbar.make(it,"This is a Travel Category", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
            snackbar.setActionTextColor(WHITE)
            val snackBarView = snackbar.view
            snackBarView.setBackgroundColor(GREEN)
            snackbar.show()
        }

        val btn_similar = findViewById(R.id.similarBtn) as TextView

        btn_similar.setOnClickListener{
            val snackbar = Snackbar.make(it,"Similar apps Loading", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
            snackbar.setActionTextColor(WHITE)
            val snackBarView = snackbar.view
            snackBarView.setBackgroundColor(GREEN)
            snackbar.show()
        }



    }
}

