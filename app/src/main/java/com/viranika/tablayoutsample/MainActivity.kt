package com.viranika.tablayoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.tabLayout = findViewById(R.id.tabLayout)


        tabLayout?.run { addTab(tabLayout!!.newTab().setText("First")) }
        tabLayout?.run { addTab(tabLayout!!.newTab().setText("Second")) }
        tabLayout?.run { addTab(tabLayout!!.newTab().setText("Third")) }

        /*tabLayout.addTab(tabLayout.newTab().setText("First"))
        tabLayout.addTab(tabLayout.newTab().setText("Second"))
        tabLayout.addTab(tabLayout.newTab().setText("Third"))*/
    }
}
