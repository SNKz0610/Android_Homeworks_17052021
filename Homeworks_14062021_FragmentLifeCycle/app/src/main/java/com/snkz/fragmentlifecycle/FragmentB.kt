package com.snkz.fragmentlifecycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.snkz.fragmentlifecycle.databinding.FragmentBBinding

class FragmentB : Fragment() {
    private val args by navArgs<FragmentBArgs>()
    private lateinit var fragBBinding: FragmentBBinding
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        fragBBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_b, container, false)
        val view: View = fragBBinding.root
        val information = "Name: ${args.userInformation.name}  \n\nAge: ${args.userInformation.age} \n\nAddress: ${args.userInformation.address}"

        fragBBinding.textviewFragBDisplayinf.text = information
        fragBBinding.buttonFragBBacktofragA.setOnClickListener {
            val action = FragmentBDirections.actionFragmentBToFragmentA()
            findNavController().navigate(action)
        }
        return view
    }

}