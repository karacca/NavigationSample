package com.karacca.navigation.melon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.karacca.navigation.R

/**
 * @user: omer.karaca
 * @date: 2020-01-21
 */

class MelonFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_melon, container, false)
    }
}