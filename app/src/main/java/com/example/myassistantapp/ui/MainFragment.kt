package com.example.myassistantapp.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import com.example.myassistantapp.R
import com.example.myassistantapp.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var model: MainViewModel

    private lateinit var binding : MainFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return inflater.inflate(R.layout.main_fragment,container,false)
        binding =  DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        model = ViewModelProvider(this).get(MainViewModel::class.java)
        showAnimation()

        return binding.root

    }

    fun showAnimation(){

        binding.mainLogin.startAnimation(AnimationUtils.loadAnimation(context, R.anim.right_to_left))
        binding.mainPasswordEdit.startAnimation(AnimationUtils.loadAnimation(context, R.anim.right_to_left))
        binding.mainTextView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.right_to_left))
        binding.mainPasswordRegister.startAnimation(AnimationUtils.loadAnimation(context, R.anim.right_to_left))
        binding.passwordTextView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.right_to_left))

    }


}