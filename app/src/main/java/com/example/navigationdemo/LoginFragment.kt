package com.example.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.navigationdemo.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        binding.buttonLogin.setOnClickListener(){
            val inputUsername: String = binding.tfName.text.toString()
            val inputPassword: String = binding.tfPass.text.toString()

            if(inputPassword == "123" && inputUsername == "abc"){
                Navigation.findNavController(it).navigate(R.id.action_loginFragment_to_questionFragment2)
            }
            else{
                Toast.makeText(context, "Invalid User name or password !", Toast.LENGTH_LONG).show()
            }
        }
        return binding.root
    }

}