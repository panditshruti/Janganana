package com.shrutikumaripandit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shrutikumaripandit.databinding.ActivityDetailsFillBinding

class DetailsFill : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsFillBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsFillBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.submitbtn.setOnClickListener {
            // Get the data you want to pass
            val headname = binding.head.text.toString()
            val name = binding.name.text.toString()
            val fname = binding.fname.text.toString()
            val mname = binding.mname.text.toString()
            val age = binding.age.text.toString()
            val state = binding.state.text.toString()
            val mobile = binding.mobno.text.toString()
            val work = binding.work.text.toString()
            val category = binding.catogory.text.toString()
            val income = binding.income.text.toString()
            val qualification = binding.qualification.text.toString()

            val intent = Intent(this@DetailsFill, SaveDeails::class.java)

            intent.putExtra("HEAD", headname)
            intent.putExtra("NAME", name)
            intent.putExtra("FNAME", fname)
            intent.putExtra("MNAME", mname)
            intent.putExtra("WORK", work)
            intent.putExtra("INCOME", income)
            intent.putExtra("QUALIFICATION", qualification)
            intent.putExtra("STATE", state)
            intent.putExtra("MOBBILE", mobile)
            intent.putExtra("CATEGORY", category)
            intent.putExtra("AGE", age)

            startActivity(intent)
        }

    }
}