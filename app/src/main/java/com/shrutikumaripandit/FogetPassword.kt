package com.shrutikumaripandit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shrutikumaripandit.databinding.ActivityFogetPasswordBinding

class FogetPassword : AppCompatActivity() {
    private lateinit var binding: ActivityFogetPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFogetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitbtn.setOnClickListener{

            val pass = binding.edPassword.text.toString()
            val intent = Intent(this,LoginActivity::class.java)
            intent.putExtra("pass",pass)
            startActivity(intent)

        }


    }
}