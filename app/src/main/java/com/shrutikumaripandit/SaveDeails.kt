package com.shrutikumaripandit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.shrutikumaripandit.databinding.ActivitySaveDeailsBinding

class SaveDeails : AppCompatActivity() {
    private lateinit var binding: ActivitySaveDeailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaveDeailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showDialog()

    }
    private fun showDialog() {
        // Create an AlertDialog.Builder
        val builder = AlertDialog.Builder(this)

        // Set the title and message for the dialog
        builder.setTitle("Alert Dialog")
        builder.setMessage("you are sure your details is write")

        // Set positive button and its click listener
        builder.setPositiveButton("OK") { dialog, _ ->

            val head = intent.getStringExtra("HEAD")
            val name = intent.getStringExtra("NAME")
            val fname = intent.getStringExtra("FNAME")
            val maname = intent.getStringExtra("MNAME")
            val work = intent.getStringExtra("WORK")
            val income = intent.getStringExtra("INCOME")
            val qualification =  intent.getStringExtra("QUALIFICATION")
            val state =intent.getStringExtra("STATE")
            val mobbile = intent.getStringExtra("MOBBILE")
            val category =intent.getStringExtra("CATEGORY")
            val age = intent.getStringExtra("AGE")

            binding.head.text = head.toString()
            binding.name.text = name.toString()
            binding.fname.text = fname.toString()
            binding.mname.text = maname.toString()
            binding.catogory.text = category.toString()
            binding.qualification.text = qualification.toString()
            binding.mobno.text = mobbile.toString()
            binding.state.text = state.toString()
            binding.work.text = work.toString()
            binding.age.text = age.toString()
            binding.income.text = income.toString()

            dialog.dismiss()
        }

        // Set negative button and its click listener
        builder.setNegativeButton("Cancel") { dialog, _ ->
            // Handle negative button click
            dialog.dismiss()
        }

        // Set neutral button and its click listener
        builder.setNeutralButton("Neutral") { dialog, _ ->
            // Handle neutral button click
            dialog.dismiss()
        }

        // Create and show the AlertDialog
        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()
    }
}