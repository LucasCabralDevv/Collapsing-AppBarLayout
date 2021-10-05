package com.lucascabral.collapsingtoolbarlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lucascabral.collapsingtoolbarlayout.databinding.ActivityMainBinding
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViews()
        setupListeners()
    }

    private fun setupViews() {
        val currentTime = System.currentTimeMillis()
        binding.mainDate.text = currentTime.getYearMonthDay()
    }

    private fun setupListeners() {
        binding.mainFab.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_DIAL,
                    Uri.fromParts(
                        "tel", "+55114002-8922", null
                    )
                )
            )
        }
    }
}