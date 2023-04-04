package com.example.testmedia

import android.os.Bundle
import android.system.Os.bind
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testmedia.databinding.ActivityOnBordingBinding.bind
import com.example.testmedia.databinding.FirstOnBoardVpBinding.bind
import com.example.testmedia.databinding.FragmentSuppBinding


class SuppFragment : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentSuppBinding.bind(view)


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_supp, container, false)
    }



}