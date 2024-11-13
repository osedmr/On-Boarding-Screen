package com.example.onboardingscreen.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.onboardingscreen.fragments.viewpages2.FifthFragment
import com.example.onboardingscreen.fragments.viewpages2.FirstFragment
import com.example.onboardingscreen.fragments.viewpages2.FourthFragment
import com.example.onboardingscreen.fragments.viewpages2.SecondFragment
import com.example.onboardingscreen.fragments.viewpages2.ThirdFragment

class ViewPager2Adapter(fragment:FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fragment,lifecycle) {

    val fragments = listOf(FirstFragment(), SecondFragment(), ThirdFragment(), FourthFragment(), FifthFragment())
    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}