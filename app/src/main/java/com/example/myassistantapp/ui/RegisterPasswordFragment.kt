package com.example.myassistantapp.ui

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.myassistantapp.R
import com.example.myassistantapp.databinding.RegisterPasswordFragmentBinding

class RegisterPasswordFragment : Fragment() {

    companion object {
        fun newInstance() = RegisterPasswordFragment()
    }

    private lateinit var viewModel: RegisterPasswordViewModel

    private lateinit var binding : RegisterPasswordFragmentBinding

    private lateinit var sharedPreferences: SharedPreferences

    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.register_password_fragment,
            container,
            false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegisterPasswordViewModel::class.java)
        binding.model = viewModel
        sharedPreferences = activity?.getSharedPreferences("UserInfo",Context.MODE_PRIVATE)!!

        navController = findNavController()
        binding.newRegisterPasswordBtn.setOnClickListener {


            if(viewModel.newPassword.value!!.length==4){

                if(viewModel.newPassword.value==viewModel.newPasswordSecond.value){

                    val editor: SharedPreferences.Editor = sharedPreferences.edit()

                    editor.putString("password", viewModel.newPassword.value!!)

                    if(editor.commit()){

                        navController.popBackStack()

                    }
                }else{
                    Toast.makeText(context,"서로 다른 비밀번호를 입력 하셨습니다",Toast.LENGTH_SHORT).show()

                }

            }else{
                Toast.makeText(context,"정확한 비밀번호 4자리를 입력해주세요",Toast.LENGTH_SHORT).show()
            }
        }

    }

}