package com.dev.ipshow.domaine.repository

import com.dev.ipshow.domaine.model.IpDomaine
import kotlinx.coroutines.flow.Flow

interface AddressIpRepository {
    fun getAddressIp(): Flow<IpDomaine>
}