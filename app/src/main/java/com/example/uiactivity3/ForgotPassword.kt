package com.example.uiactivity3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uiactivity3.databinding.ActivityForgotPasswordBinding
import com.example.uiactivity3.databinding.ActivityRegisterBinding

class ForgotPassword : AppCompatActivity() {
    lateinit var binding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.resetpassword.setOnClickListener{
            val intent = Intent(this@ForgotPassword,Login::class.java)
            startActivity(intent)

            Toast.makeText(this,"Check your Email",Toast.LENGTH_LONG).show()
        }
    }
}