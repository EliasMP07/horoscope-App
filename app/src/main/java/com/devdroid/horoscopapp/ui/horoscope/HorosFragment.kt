package com.devdroid.horoscopapp.ui.horoscope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.devdroid.horoscopapp.databinding.FragmentHorosBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HorosFragment : Fragment() {

    private val horoscopeViewModel by viewModels<HoroscopeViewModel> ()

    private var _binding: FragmentHorosBinding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHorosBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}