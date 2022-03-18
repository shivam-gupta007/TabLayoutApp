package com.example.tabLayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    //Creating Instances
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    //Creating array of Tab names
    private val tabNames = arrayOf("Home","Feed")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager2)
        tabLayout = findViewById(R.id.tab_layout)

        customizeToolBar()

        //Creating Instance of viewPagerAdapter
        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager,lifecycle)

        //Setting adapter to viewPager
        viewPager.adapter = viewPagerAdapter

        //TabLayoutMediator helps to bind the TabLayout & ViewPager
        TabLayoutMediator(tabLayout,viewPager){
            tab, position -> tab.text = tabNames[position]
        }.attach()

    }

    private fun customizeToolBar() {
        supportActionBar?.title = "OpenLy"
        supportActionBar?.setBackgroundDrawable(AppCompatResources.getDrawable(this,R.color.black_shade))
        supportActionBar?.subtitle = "An Open Platform for all"
    }
}