package com.erendagistan.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.erendagistan.bmicalculator.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.calculateBtn.setOnClickListener {
            val weight=binding.etWeight.text.toString()
            val height = binding.etHeight.text.toString()
            if(validateInput(weight,height)){
                val bmi=weight.toFloat()/((height.toFloat()/100)*(height.toFloat()/100))
                val bmi2Digits = String.format("%.2f",bmi).toFloat()   //get result with two decimal places
                displayResult(bmi2Digits)
            }
        }
    }

    private fun validateInput(weight:String?,height:String?) :Boolean {
        return when{
            weight.isNullOrEmpty()->{
                Toast.makeText(this,"Weight is empty",Toast.LENGTH_LONG).show()
                return false
            }
            height.isNullOrEmpty()->{
                Toast.makeText(this,"Height is empty",Toast.LENGTH_LONG).show()
                return false
            }
            else -> {
                return true
            }
        }
    }

    private fun displayResult(bmi:Float){

        binding.tvIndex.text=bmi.toString()
        binding.tvInfo.text="(Normal range is 18.5-24.9)"

        

        var resultText=""
        var color = 0

        when{
            bmi<18.50 ->{
                resultText="Underweight"
                color=R.color.underweight
            }
            bmi in 18.50..24.99 ->{
                resultText="Normal"
                color=R.color.normal
            }
            bmi in 25.00..29.99 ->{
                resultText="Overweight"
                color=R.color.overweight
            }
            bmi>29.99 ->{
                resultText="Obese"
                color=R.color.obese
            }
        }
        binding.tvResult.setTextColor(ContextCompat.getColor(this,color))
        binding.tvResult.text=resultText


    }



}