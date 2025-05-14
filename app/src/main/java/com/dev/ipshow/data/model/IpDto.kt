package com.dev.ipshow.data.model

import com.dev.ipshow.domaine.model.IpDomaine

data class IpDto(
    val ip:String
)

fun IpDto.toDomain(): IpDomaine {
    return IpDomaine(ip = this.ip)
}