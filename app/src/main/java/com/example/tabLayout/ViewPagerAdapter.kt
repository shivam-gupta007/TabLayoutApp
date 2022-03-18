package com.example.tabLayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(mFragmentManager: FragmentManager, mLifecycle: Lifecycle) :
    FragmentStateAdapter(mFragmentManager, mLifecycle) {

    private val totalTabs: Int = 2

    //Returns the total number of tabs
    override fun getItemCount(): Int = totalTabs

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return HomeFragment()
        }
        return FeedFragment()
    }
}