package com.example.locationapp
import android.Manifest

import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat

class locationUtils(val context: Context) {
    fun hasLocationPermission(context: Context):Boolean{
        if(ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
            &&
            ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED

            ){
            return true
        }
        else{
            return false

        }

    }
}