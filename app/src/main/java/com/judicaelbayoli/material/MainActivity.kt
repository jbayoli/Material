package com.judicaelbayoli.material

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun googleLogin(view: View) {
        val intent = Intent(this, GoogleLoginActivity::class.java)
        startActivity(intent)
    }

    fun facebookLogin(view: View){
        val intent = Intent(this, FacebookLoginActivity::class.java)
        startActivity(intent)
    }
}
