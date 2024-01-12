package com.shrutikumaripandit

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import com.shrutikumaripandit.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val sharedPreferences = getSharedPreferences("MY_PRE",Context.MODE_PRIVATE)
        val mobno = sharedPreferences.getString("MOBNO","")
        val password = sharedPreferences.getString("PASSWORD","")

        if (mobno !="" && password != ""){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.loginbtn.setOnClickListener {

            val mobno = binding.edMobbileno.text.toString()
            val password = binding.edPassword.text.toString()
            if (TextUtils.isEmpty(mobno)){
                binding.edMobbileno.error = "Require mobile-No"
            }
            if (TextUtils.isEmpty(password)){
                binding.edPassword.error = "Require Password"
            }
            val editor = sharedPreferences.edit()
            editor.putString("MOBNO",mobno)
            editor.putString("PASSWORD",password)
            editor.apply()

            val intents = Intent(this,LoginActivity::class.java)
            startActivity(intents)
            finish()


        }

        binding.forgetpass.setOnClickListener {

            val intent = Intent(this,FogetPassword::class.java)
            startActivity(intent)
//            val intents = getIntent().getStringExtra("name")
//            startActivity(intents)


        }


    }


}