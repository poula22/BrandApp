package com.test.data.data_source.remote

import com.test.data.api.RetrofitApi
import com.test.data.toBrandDomainModel
import com.test.domain.dataSource.BrandRemoteDataSource
import com.test.domain.models.BrandDomainModel

class BrandRemoteDataSourceImpl(private val retrofitApi: RetrofitApi):
    BrandRemoteDataSource {
    override suspend fun getMobileS(): BrandDomainModel {
        return retrofitApi.getMobileS().toBrandDomainModel()
    }

    override suspend fun getMobileI(): BrandDomainModel {
        return retrofitApi.getMobileI().toBrandDomainModel()
    }
}