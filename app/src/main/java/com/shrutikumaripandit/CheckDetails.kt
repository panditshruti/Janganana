package com.shrutikumaripandit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.shrutikumaripandit.databinding.ActivityCheckDetailsBinding

class CheckDetails : AppCompatActivity() {
    private lateinit var binding: ActivityCheckDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showDialog()

        binding.nextbtn.setOnClickListener {


            val intent = Intent(this,SaveDeails::class.java)
             startActivity(intent)

        }


    }
    private fun showDialog() {
        // Create an AlertDialog.Builder
        val builder = AlertDialog.Builder(this)

        // Set the title and message for the dialog
        builder.setTitle("Alert Dialog")
        builder.setMessage("you are sure your details is write")

        // Set positive button and its click listener
        builder.setPositiveButton("OK") { dialog, _ ->
            // Handle positive button click
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