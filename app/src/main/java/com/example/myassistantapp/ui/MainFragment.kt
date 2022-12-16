package com.example.myassistantapp.ui

import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.myassistantapp.R
import com.example.myassistantapp.database.UserDatabase
import com.example.myassistantapp.databinding.MainFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var model: MainViewModel

    private lateinit var binding : MainFragmentBinding

    private lateinit var navController: NavController

    private lateinit var  scope : CoroutineScope

    private lateinit var sharedPreferences: SharedPreferences


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return inflater.inflate(R.layout.main_fragment,container,false)
        binding =  DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)

        showAnimation()


        navController = findNavController()
        model = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.model = model

        sharedPreferences = activity?.getSharedPreferences("UserInfo",Context.MODE_PRIVATE)!!


        binding.mainPasswordRegister.setOnClickListener {

            navController.navigate(R.id.action_mainFragment_to_registerPassword)
        }

        binding.mainLogin.setOnClickListener {

            if (model.password.value!!.length == 4) {

                if (sharedPreferences.getString("password", "NoData") == model.password.value) {

                        // goTo mainView
                        navController.navigate(R.id.action_mainFragment_to_assistantFragment)

                }else{
                    Toast.makeText(context,"유효 하지 않은 비밀번호 입니다",Toast.LENGTH_SHORT).show()
                }
            }
        }
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