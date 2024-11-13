package com.example.onboardingscreen.fragments.viewpages2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onboardingscreen.R
import com.example.onboardingscreen.databinding.FragmentFifthBinding
import com.example.onboardingscreen.fragments.HomeFragment
import com.example.onboardingscreen.fragments.ViewPagerFragment


class FifthFragment : Fragment() {
    private lateinit var binding: FragmentFifthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFifthBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.right.setOnClickListener {
            onBoardScreenSeen()
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, HomeFragment())
                commit()
            }
        }
        binding.left.setOnClickListener {
            ViewPagerFragment.viewPagerObject?.currentItem = 3
        }
    }

    private fun onBoardScreenSeen(){
        val sharePref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharePref.edit()
        editor.putBoolean("seen",true)
        editor.apply()
    }
}