package com.example.hrybkov_l12

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hrybkov_l12.databinding.HwBottomSheetDialogFragmentBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class HwBottomSheetDialogFragment : BottomSheetDialogFragment() {

    private lateinit var binding: HwBottomSheetDialogFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = HwBottomSheetDialogFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}