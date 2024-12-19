package com.example.bingo_nadal.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bingo_nadal.R
import com.example.bingo_nadal.databinding.FragmentCartoBinding
import com.example.bingo_nadal.databinding.FragmentNumeroBinding

class CartoFragment : Fragment() {
    private lateinit var binding: FragmentCartoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val arrayCarto = ArrayList<Int>()
        var i = 0
        while (i < 15) {
            val numero = (1..90).random()
            if (!arrayCarto.contains(numero)) {
                arrayCarto.add(numero)
            } else {
                i--
            }
        }
        binding.celda11.text = arrayCarto[0].toString()
        binding.celda12.text = arrayCarto[1].toString()
        binding.celda13.text = arrayCarto[2].toString()
        binding.celda14.text = arrayCarto[3].toString()
        binding.celda15.text = arrayCarto[4].toString()
        binding.celda21.text = arrayCarto[5].toString()
        binding.celda22.text = arrayCarto[6].toString()
        binding.celda23.text = arrayCarto[7].toString()
        binding.celda24.text = arrayCarto[8].toString()
        binding.celda25.text = arrayCarto[9].toString()
        binding.celda31.text = arrayCarto[10].toString()
        binding.celda32.text = arrayCarto[11].toString()
        binding.celda33.text = arrayCarto[12].toString()
        binding.celda34.text = arrayCarto[13].toString()
        binding.celda35.text = arrayCarto[14].toString()




    }

}