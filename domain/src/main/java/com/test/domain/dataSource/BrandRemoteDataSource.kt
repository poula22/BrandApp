package com.test.domain.dataSource

import com.test.domain.models.BrandDomainModel

interface BrandRemoteDataSource {
    suspend fun getMobileS():BrandDomainModel
    suspend fun getMobileI():BrandDomainModel
}