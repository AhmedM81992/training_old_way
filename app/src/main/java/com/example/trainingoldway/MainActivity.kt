package com.example.trainingoldway

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.trainingoldway.databinding.ActivityMain2Binding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val titleColor = resources.getColor(R.color.white)
        var titleText = resources.getString(R.string.health_check)
        binding.button1.text = titleText
    }
}