package com.star.radiobuttonactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.star.radiobuttonactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var rgGender:RadioGroup
    lateinit var rbHe:RadioButton
    lateinit var rbShe:RadioButton
    lateinit var rbOther:RadioButton
    lateinit var etOtherName: EditText
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
         rbHe = findViewById(R.id.rbHe)
        rbShe = findViewById(R.id.rbShe)
        rbOther = findViewById(R.id.rbOther)
        rgGender = findViewById(R.id.rgGender)

        rgGender.setOnCheckedChangeListener{ RadioGroup,id ->
            when(id){
                R.id.rbOther->{
                 Toast.makeText(this,resources.getString(R.string.others),Toast.LENGTH_LONG).show()
                 etOtherName.visibility = View.VISIBLE
                }
            else->{
                etOtherName.visibility = View.INVISIBLE

            }
        }
    }
}