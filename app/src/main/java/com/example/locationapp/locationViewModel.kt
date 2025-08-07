package com.example.locationapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class locationViewModel:ViewModel() {

    private val _location = mutableStateOf<locationData?>(null)
    val location: State<locationData?> = _location


    fun updateLocation(newlocation: locationData){
        _location.value = newlocation
    }
}//