package com.example.blechat.scan

import android.bluetooth.BluetoothDevice

/**
 * Created by Ajay Vamsee on 7/21/2023.
 * Time : 19:43
 */
sealed class DeviceScanViewState {

    object ActiveScan : DeviceScanViewState()

    class ScanResults(val scanResults: Map<String, BluetoothDevice>) : DeviceScanViewState()

    class Error(val message: String) : DeviceScanViewState()

    object AdvertisementNotSupport : DeviceScanViewState()
}
