package com.example.bingo_nadal.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bingo_nadal.databinding.FragmentCartoBinding
import com.example.bingo_nadal.databinding.FragmentNumeroBinding

class NumeroFragment : Fragment() {
    private lateinit var binding: FragmentNumeroBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("onViewCreated")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNumeroBinding.inflate(inflater, container, false)
        return binding.root
    }
}