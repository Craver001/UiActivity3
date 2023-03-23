package com.example.uiactivity3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.example.uiactivity3.databinding.ActivityLoginBinding
import com.example.uiactivity3.databinding.ActivityMainBinding

class Login : AppCompatActivity() {

    lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.login.setOnClickListener{
            val intent = Intent(this@Login,MainActivity::class.java)
            startActivity(intent)
        }

        binding.signup.setOnClickListener{
            val intent = Intent(this@Login,Register::class.java)
            startActivity(intent)
        }

        binding.forgotPassword.setOnClickListener{
            val intent = Intent(this@Login,ForgotPassword::class.java)
            startActivity(intent)
        }

    }
}