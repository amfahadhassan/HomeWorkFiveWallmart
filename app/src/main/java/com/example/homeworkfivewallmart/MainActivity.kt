package com.example.homeworkfivewallmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var users = ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        var success= false

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = intent.getSerializableExtra("USER") as? User

        if (user != null) {
            users.add(user)
        }
        populateUserData()

        btnSignIn.setOnClickListener {
            for (user in users){
                if (user.email == edtEmail.text.toString() && user.password == edtPassword.text.toString()){

                    success = true
                    Toast.makeText(this,"Successfully signed in!!!", Toast.LENGTH_SHORT).show()

                    var intent = Intent(this,ShoppingCategoryActivity::class.java)
                    intent.putExtra("EMAIL", edtEmail.text.toString())
                    startActivity(intent)
                }
            }

            if (!success)
                Toast.makeText(this,"Login or Password is incorrect", Toast.LENGTH_SHORT).show()
        }

        btnCreate.setOnClickListener {
            var intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }

    }

    private fun populateUserData() {
        users.add(User("First","User","user1@email.com","123"))
        users.add(User("Second","User","user2@email.com","1234"))
        users.add(User("Third","User","user2@email.com","12345"))

    }
}