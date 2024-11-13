package com.example.onboardingscreen.fragments.viewpages2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onboardingscreen.databinding.FragmentFourthBinding
import com.example.onboardingscreen.fragments.ViewPagerFragment


class FourthFragment : Fragment() {

    private lateinit var binding: FragmentFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFourthBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.right.setOnClickListener {
            ViewPagerFragment.viewPagerObject?.currentItem = 4
        }

        binding.left.setOnClickListener {
            ViewPagerFragment.viewPagerObject?.currentItem = 2
        }
    }

}