package com.snkz.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.snkz.fragmentlifecycle.databinding.FragmentABinding
import java.lang.NumberFormatException


class FragmentA : Fragment() {
    val TAG: String = "Fragment_A"
    private lateinit var fragmentABinding: FragmentABinding

    override fun onAttach(context: Context) {
        Log.d(TAG, "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView")
        fragmentABinding = DataBindingUtil.inflate(inflater, R.layout.fragment_a, container, false)
        val view: View = fragmentABinding.root

        val buttonSubmit = fragmentABinding.buttonFragASubmit.setOnClickListener {
            val inf: Information = getInformation()
            if (inf.address.isEmpty() || inf.age.equals(0) || inf.name.isEmpty()) {
                Toast.makeText(this.context, "Are you blind??? Check all the fields again pls idiot", Toast.LENGTH_LONG).show()
            } else {
                if (inf.age > 100) {
                    Toast.makeText(this.context, "Age in no more than 100, idiot", Toast.LENGTH_LONG).show()
                } else {
                    val action = FragmentADirections.actionFragmentAToFragmentB(getInformation())
                    findNavController().navigate(action)
                }
            }
        }
        return view
    }

    fun getInformation(): Information {
        var age: Int = 0
        val name: String = fragmentABinding.edittextFragAName.text.toString()
        try {
            age = fragmentABinding.edittextFragABirthday.text.toString().toInt()
        } catch (e: NumberFormatException) {
            print(e)
        }
        val address: String = fragmentABinding.edittextFragAAddress.text.toString()

        return Information(name, age, address)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG, "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG, "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG, "onDetach")
        super.onDetach()
    }


}