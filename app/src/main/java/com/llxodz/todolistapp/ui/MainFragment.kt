package com.llxodz.todolistapp.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.llxodz.todolistapp.R
import com.llxodz.todolistapp.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {

    private val binding by viewBinding(FragmentMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            btnAddFragment.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_addFragment)
            }

            btnNoteFragment.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_noteFragment)
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MainFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}
