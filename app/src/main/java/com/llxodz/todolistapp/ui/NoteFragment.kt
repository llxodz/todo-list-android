package com.llxodz.todolistapp.ui

import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.llxodz.todolistapp.R
import com.llxodz.todolistapp.databinding.FragmentNoteBinding

class NoteFragment : Fragment(R.layout.fragment_note) {

    private val binding by viewBinding(FragmentNoteBinding::bind)

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NoteFragment().apply {
            }
    }
}
