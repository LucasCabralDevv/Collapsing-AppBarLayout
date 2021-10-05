package com.lucascabral.collapsingtoolbarlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lucascabral.collapsingtoolbarlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViews()
        binding.mainFab.setOnClickListener {

        }
    }

    private fun setupViews() {
        val currentTime = System.currentTimeMillis()
        binding.mainDate.text = currentTime.getYearMonthDay()
    }
}