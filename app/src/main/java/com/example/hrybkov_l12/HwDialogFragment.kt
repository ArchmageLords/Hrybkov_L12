package com.example.hrybkov_l12

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.hrybkov_l12.databinding.DialogFragmentBinding

class HwDialogFragment : DialogFragment() {

    private lateinit var binding: DialogFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}