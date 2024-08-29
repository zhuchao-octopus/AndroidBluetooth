package com.octopus.android.bluetooth;

import android.bluetooth.BluetoothDevice;


public class BleDevice {
    private BluetoothDevice bluetoothDevice;  //蓝牙设备
    private int RSSI;  //蓝牙信号

    public BleDevice(BluetoothDevice bluetoothDevice, int RSSI) {
        this.bluetoothDevice = bluetoothDevice;
        this.RSSI = RSSI;
    }

    public BluetoothDevice getBluetoothDevice() {
        return bluetoothDevice;
    }

    public void setBluetoothDevice(BluetoothDevice bluetoothDevice) {
        this.bluetoothDevice = bluetoothDevice;
    }

    public int getRSSI() {
        return RSSI;
    }

    public void setRSSI(int RSSI) {
        this.RSSI = RSSI;
    }
}
