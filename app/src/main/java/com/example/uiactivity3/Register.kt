package com.example.uiactivity3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import com.example.uiactivity3.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {

    lateinit var binding:ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkBox.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked) {
                binding.registerPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
                binding.confirmPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
            } else {
                binding.registerPassword.transformationMethod = PasswordTransformationMethod.getInstance()
                binding.confirmPassword.transformationMethod = PasswordTransformationMethod.getInstance()
            }

        }

        binding.registerSignUp.setOnClickListener{
            val intent = Intent(this@Register,MainActivity::class.java)
            startActivity(intent)

        }

        binding.rlogin.setOnClickListener{
            val intent = Intent(this@Register,Login::class.java)
            startActivity(intent)

        }
    }
}