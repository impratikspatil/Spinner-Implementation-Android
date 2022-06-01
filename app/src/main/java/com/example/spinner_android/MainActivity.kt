package com.example.spinner_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.spinner_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.spinner.onItemSelectedListener=object: AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(adapterview: AdapterView<*>?, view: View?, pos: Int, id: Long) {
                if (adapterview != null) {
                    Toast.makeText(this@MainActivity,"you have selected ${adapterview.getItemAtPosition(pos).toString()}",
                        Toast.LENGTH_SHORT).show()
                    binding.spinnerValText.text=adapterview.getItemAtPosition(pos).toString()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

    }
}