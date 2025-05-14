package com.dev.ipshow.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dev.ipshow.domaine.usescase.GetAddressIpUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel(
    private val getAddressIpUseCase: GetAddressIpUseCase,
) : ViewModel() {

    private val ipAddress = MutableStateFlow<String?>(null)
    val ipAddressState: StateFlow<String?> = ipAddress

    fun getAddressIp() {
        viewModelScope.launch {
            getAddressIpUseCase().collect { ip ->
                ipAddress.value = ip.ip
            }
        }
    }

}