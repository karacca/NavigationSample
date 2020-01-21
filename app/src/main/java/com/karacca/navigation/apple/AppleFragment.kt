package com.karacca.navigation.apple

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.karacca.navigation.R
import kotlinx.android.synthetic.main.fragment_apple.*

/**
 * @user: omer.karaca
 * @date: 2020-01-21
 */

private const val TAG = "AppleFragment"

class AppleFragment : Fragment() {

    private lateinit var viewModel: AppleViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView")
        return inflater.inflate(R.layout.fragment_apple, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated")
        viewModel = ViewModelProviders.of(this).get(AppleViewModel::class.java)
        viewModel.count.observe(viewLifecycleOwner, Observer {
            Log.d(TAG, "viewModel.count changed")
            countTextView.text = "$it"
        })
        setListeners()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "onActivityCreated")
    }

    private fun setListeners() {
        Log.d(TAG, "setListeners")

        minusButton.setOnClickListener {
            viewModel.decrement()
        }

        plusButton.setOnClickListener {
            viewModel.increment()
        }

        appleTextView.setOnClickListener {
            findNavController().navigate(R.id.appleToAppleDetail)
        }
    }
}