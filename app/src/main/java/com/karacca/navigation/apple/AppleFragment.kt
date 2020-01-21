package com.karacca.navigation.apple

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.karacca.navigation.R

/**
 * @user: omer.karaca
 * @date: 2020-01-21
 */

class AppleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_apple, container, false)
        view.findViewById<AppCompatTextView>(R.id.appleTextView)?.setOnClickListener {
            findNavController().navigate(R.id.appleToAppleDetail)
        }
        return view
    }
}