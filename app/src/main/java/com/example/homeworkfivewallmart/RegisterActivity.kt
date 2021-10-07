package com.example.homeworkfivewallmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var actionBar = getSupportActionBar()

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        btnSignIn.setOnClickListener {
            if(edtFirstName != null || edtLastName != null||edtEmail != null ||edtPassword!=null) {
                var user = User(edtFirstName.text.toString(),edtLastName.text.toString(),edtEmail.text.toString(),edtPassword.text.toString())
                var intent = Intent(this, MainActivity::class.java)
                intent.putExtra("USER", user)
                Toast.makeText(this, "Account created successfully", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
}