package com.example.blechat

import android.Manifest
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi

private const val s = "TAG"

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestPermission.launch(
            arrayOf(
                Manifest.permission.BLUETOOTH_ADVERTISE,
                Manifest.permission.BLUETOOTH_CONNECT,
                Manifest.permission.BLUETOOTH_SCAN
            )
        )
    }

    override fun onStart() {
        super.onStart()


    }

    private val requestPermission =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()){
            it.entries.forEach{ permission ->
                Log.d("TAG", ": ${permission.key} = ${permission.value}")
            }
        }
}