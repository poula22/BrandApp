package com.test.data.repo

import com.test.domain.dataSource.BrandLocalDataSource
import com.test.domain.dataSource.BrandRemoteDataSource
import com.test.domain.models.BrandDomainModel
import com.test.domain.repo.PurchaseMobileRepo

class PurchaseMobileRepoImpl(private val remoteDataSource:BrandRemoteDataSource, private val localDataSource: BrandLocalDataSource):PurchaseMobileRepo {
    override suspend fun getMobile(char: Char): BrandDomainModel {
        if (char.equals('I',true)){
            return remoteDataSource.getMobileI()
        }
        return remoteDataSource.getMobileS()
    }
}