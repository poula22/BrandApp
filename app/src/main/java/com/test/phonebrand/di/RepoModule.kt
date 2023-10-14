package com.test.phonebrand.di

import com.test.data.repo.PurchaseMobileRepoImpl
import com.test.domain.dataSource.BrandLocalDataSource
import com.test.domain.dataSource.BrandRemoteDataSource
import com.test.domain.repo.PurchaseMobileRepo
import com.test.domain.use_case.PurchaseMobileUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun providePurchaseMobileRepo(remoteDataSource: BrandRemoteDataSource,localDataSource: BrandLocalDataSource):PurchaseMobileRepo{
        return PurchaseMobileRepoImpl(
            remoteDataSource = remoteDataSource,
            localDataSource = localDataSource
        )
    }

    @Provides
    fun providePurchaseMobileUseCase(repo: PurchaseMobileRepo): PurchaseMobileUseCase{
        return PurchaseMobileUseCase(
            purchaseMobileRepo = repo
        )
    }
}