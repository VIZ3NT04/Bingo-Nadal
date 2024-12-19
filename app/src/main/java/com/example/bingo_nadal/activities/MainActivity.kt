package com.example.bingo_nadal.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.bingo_nadal.R
import com.example.bingo_nadal.databinding.ActivityMainBinding
import com.example.bingo_nadal.fragments.CartoFragment
import com.example.bingo_nadal.fragments.NumeroFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadBothFragments(CartoFragment(), NumeroFragment())


    }
    private fun loadBothFragments(fragment1: Fragment, fragment2: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragmentCarto, fragment1)
        transaction.add(R.id.fragmentNumeros, fragment2)
        transaction.commit()
    }
}