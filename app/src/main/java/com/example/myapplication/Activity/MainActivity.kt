package com.example.myapplication.Activity

import android.content.Intent
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setVariable()
    }

    private fun setVariable() {
        binding.apply {
            btn1.setOnClickListener { startListActivity(1, "Ice Drinks") }
            btn2.setOnClickListener { startListActivity(2, "Hot Drinks") }
            btn3.setOnClickListener { startListActivity(3, "Hot Coffee") }
            btn4.setOnClickListener { startListActivity(4, "Ice Coffee") }
            btn5.setOnClickListener { startListActivity(5, "Brewing Coffee") }
            btn6.setOnClickListener { startListActivity(6, "Shakes") }
            btn7.setOnClickListener { startListActivity(7, "Restaurant") }
            btn8.setOnClickListener { startListActivity(8, "Breakfast") }
            btn9.setOnClickListener { startListActivity(9, "Cakes") }
        }
    }

    private fun startListActivity(id: Int, title: String){
        val intent = Intent(this, ListActivity::class.java)
        intent.putExtra("id", id)
        intent.putExtra("title", title)
        startActivity(intent)
    }
}