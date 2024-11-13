package com.example.onboardingscreen.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.onboardingscreen.R
import com.example.onboardingscreen.adapters.ViewPager2Adapter
import com.example.onboardingscreen.databinding.FragmentViewPagerBinding


class ViewPagerFragment : Fragment() {
    private lateinit var binding: FragmentViewPagerBinding
    private lateinit var adapter: ViewPager2Adapter

    companion object{
        var viewPagerObject:ViewPager2? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val dotsIndicator = binding.dotsIndicator
        val viewPager = binding.viewPager
        adapter = ViewPager2Adapter(requireActivity().supportFragmentManager, lifecycle)
        viewPager.adapter = adapter
        dotsIndicator.attachTo(viewPager)

        viewPagerObject = binding.viewPager
    }

    override fun onDestroy() {
        super.onDestroy()
        viewPagerObject = null

    }

}