package com.dev.ipshow.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import org.koin.androidx.compose.koinViewModel


@Composable
fun MainScreen(innerPadding: PaddingValues) {

    val mainViewModel = koinViewModel<MainViewModel>()

    LaunchedEffect(Unit) {
        mainViewModel.getAddressIp()
    }

    val ip by mainViewModel.ipAddressState.collectAsState()

    IpContent(
        ip = ip ?: "",
        modifier = Modifier.padding(innerPadding)
    )
}


@Composable
fun IpContent(ip: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello $ip",
            fontWeight = FontWeight.Bold
        )
    }
}



