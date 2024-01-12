package com.shrutikumaripandit

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.shrutikumaripandit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var arraylist:ArrayList<String>
    private lateinit var arrayAdapter:ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences("MY_PRE", Context.MODE_PRIVATE)
        val mobno = sharedPreferences.getString("MOBNO", "").toString()
        val password = sharedPreferences.getString("PASSWORD", "").toString()


        arraylist = arrayListOf()
        arraylist.add("1-Ramlal ram")
        arraylist.add("2-shyamlal ram")
        arraylist.add("3-Ramlal ram")
        arraylist.add("4-Ramlal ram")
        arraylist.add("5-Ramlal ram")
        arraylist.add("6-Ramlal ram")
        arraylist.add("7-Ramlal ram")
        arraylist.add("8-Ramlal ram")
        arraylist.add("9-Ramlal ram")
        arraylist.add("10-Ramlal ram")
        arraylist.add("3-Ramlal ram")
        arraylist.add("4-Ramlal ram")
        arraylist.add("5-Ramlal ram")
        arraylist.add("6-Ramlal ram")
        arraylist.add("7-Ramlal ram")
        arraylist.add("8-Ramlal ram")
        arraylist.add("9-Ramlal ram")
        arraylist.add("10-Ramlal ram")

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arraylist)
        binding.listview.adapter = arrayAdapter

        binding.listview.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            // Handle item click here
            val selectedItem = arraylist[position]

            // Start SecondActivity and pass data if needed
            val intent = Intent(this@MainActivity, DetailsFill::class.java)
            intent.putExtra("selectedItem", selectedItem)
            startActivity(intent)

        })
    }
}