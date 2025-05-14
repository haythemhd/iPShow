package com.dev.ipshow.data.repository

import com.dev.ipshow.data.model.toDomain
import com.dev.ipshow.data.service.ApiService
import com.dev.ipshow.domaine.model.IpDomaine
import com.dev.ipshow.domaine.repository.AddressIpRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class AddressIpRepositoryImpl(
    private val apiService: ApiService
) : AddressIpRepository {

    override fun getAddressIp(): Flow<IpDomaine> {
        return flow {
            val ip = apiService.getAddressIp()
            emit(ip.toDomain())
        }
    }

}