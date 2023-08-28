package com.example.blechat.bluetooth

import android.app.Activity
import android.bluetooth.BluetoothAdapter
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.blechat.R
import com.example.blechat.databinding.FragmentEnableBluetoothBinding

class EnableBluetoothFragment : Fragment() {

    private var _binding: FragmentEnableBluetoothBinding? = null

    private val binding
        get() = _binding!!

    private val bluetoothEnableObserver = Observer<Boolean>{ shouldPrompt ->
                if(!shouldPrompt){
                    findNavController().navigate(R.id.action_check_location_permissions)
                }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentEnableBluetoothBinding.inflate(inflater,container,false)


        binding.errorAction.setOnClickListener {
            val enableIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
            startActivityForResult(enableIntent, REQUEST_ENABLE_BT)
        }

        return binding.root
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            REQUEST_ENABLE_BT -> {
                if (requestCode == Activity.RESULT_OK) {

                }
                super.onActivityResult(requestCode, resultCode, data)
            }
            else -> super.onActivityResult(requestCode,resultCode,data)
        }
    }
}