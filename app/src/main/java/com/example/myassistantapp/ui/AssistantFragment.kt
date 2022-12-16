package com.example.myassistantapp.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myassistantapp.R
import com.example.myassistantapp.adapter.adapter
import com.example.myassistantapp.databinding.AssistantFragmentBinding

class AssistantFragment : Fragment() {

    companion object {
        fun newInstance() = AssistantFragment()
    }

    private lateinit var viewModel: AssistantViewModel

    private lateinit var binding : AssistantFragmentBinding

    private lateinit var adapter : adapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.assistant_fragment,container,false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AssistantViewModel::class.java)

        binding.model = viewModel

        adapter = adapter()

        binding.assistantRcv.adapter = adapter

        binding.assistantRcv.layoutManager = LinearLayoutManager(activity?.applicationContext)

    }

}