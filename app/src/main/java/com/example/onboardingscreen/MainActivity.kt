package com.example.onboardingscreen

import android.content.Context
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.onboardingscreen.databinding.ActivityMainBinding
import com.example.onboardingscreen.fragments.HomeFragment
import com.example.onboardingscreen.fragments.ViewPagerFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val sharePref = getSharedPreferences("onBoarding", Context.MODE_PRIVATE).getBoolean("seen",false)

        if (sharePref){
            changeFragment(HomeFragment())
        }else{
            changeFragment(ViewPagerFragment())
        }


    }

    private fun changeFragment(fragment: Fragment){

          supportFragmentManager.beginTransaction().apply {
            replace(binding.fragmentContainerView.id, fragment)
            commit()
        }

    }
}