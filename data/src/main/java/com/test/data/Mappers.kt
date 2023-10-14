package com.test.data

import com.test.data.models.local.BrandEntity
import com.test.data.models.remote.BrandDto
import com.test.domain.models.BrandDomainModel


fun BrandDto.toBrandDomainModel()=BrandDomainModel(
    brandName=brandName!!
)

fun BrandEntity.toBrandDomainModel()=BrandDomainModel(
    brandName=brandName
)

//and so on for mappers between DTO and Entity here