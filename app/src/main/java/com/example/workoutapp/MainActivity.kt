package com.example.workoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.example.workoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.flStart?.setOnClickListener{
            val intent = Intent(this,ExerciseActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onDestroy() {
        super.onDestroy()
        //Todo 4: TO avoid memory leak we unassign the binding once the activity is destroyed
        binding = null
    }
}