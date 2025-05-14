package com.dev.ipshow.domaine.usescase

import com.dev.ipshow.domaine.model.IpDomaine
import com.dev.ipshow.domaine.repository.AddressIpRepository
import kotlinx.coroutines.flow.Flow

class GetAddressIpUseCase(
    private val addressIpRepository: AddressIpRepository
) {
    suspend operator fun invoke(): Flow<IpDomaine> {
        return addressIpRepository.getAddressIp()
    }

}