package com.test.domain.dataSource

import com.test.domain.models.BrandDomainModel

interface BrandLocalDataSource {
    suspend fun getMobileS(): BrandDomainModel
    suspend fun getMobileI(): BrandDomainModel
}