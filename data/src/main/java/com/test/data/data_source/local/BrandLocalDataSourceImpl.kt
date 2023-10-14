package com.test.data.data_source.local

import com.test.data.db.LocalDatabase
import com.test.data.toBrandDomainModel
import com.test.domain.dataSource.BrandLocalDataSource
import com.test.domain.models.BrandDomainModel

class BrandLocalDataSourceImpl(private val localDatabase: LocalDatabase): BrandLocalDataSource {
    override suspend fun getMobileS(): BrandDomainModel {
        return localDatabase.getMobileS().toBrandDomainModel()
    }

    override suspend fun getMobileI(): BrandDomainModel {
        return localDatabase.getMobileI().toBrandDomainModel()
    }
}