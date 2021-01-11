package com.example.hrybkov_l12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.hrybkov_l12.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.bottom_sheet.view.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout> by lazy {
        BottomSheetBehavior.from(
            binding.root.bottomSheetContainer
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupBottomSheet()
        setupListeners()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupListeners() {
        binding.btnAlertDialog.setOnClickListener {
            showAlertDialog()
        }
        binding.btnDialogFragment.setOnClickListener {
            showDialogFragment()
        }
        binding.btnBottomSheetDialog.setOnClickListener {
            showBottomSheet()
        }
        binding.btnBottomSheetFragment.setOnClickListener {
            showBottomSheetFragment()
        }
    }

    private fun showAlertDialog() {
        AlertDialog.Builder(this)
            .setTitle("Alert Dialog")
            .setMessage("Alert dialog message")
            .setIcon(R.drawable.ic_launcher_foreground)
            .setPositiveButton("Confirm") { dialog, which ->
                Toast.makeText(this, "You confirm!", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { dialog, which ->
                Toast.makeText(this, "You decline!", Toast.LENGTH_SHORT).show()
            }
            .show()
    }

    private fun showDialogFragment() {
        val dialog = HwDialogFragment()
        supportFragmentManager.beginTransaction()
            .add(dialog, "TAG")
            .commitAllowingStateLoss()
    }

    private fun showBottomSheet() {
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED;
    }

    private fun showBottomSheetFragment() {
        supportFragmentManager.beginTransaction().add(HwBottomSheetDialogFragment(), "TAG")
            .commitNowAllowingStateLoss()
    }

    private fun setupBottomSheet() {
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_HIDDEN
    }
}