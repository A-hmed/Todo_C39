package com.route.todoc39.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.todoc39.R
import com.route.todoc39.database.MyDatabase

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        MyDatabase.getInstance(this)

    }
}