package com.test.phonebrand.di

import com.test.data.api.RetrofitApi
import com.test.data.data_source.local.BrandLocalDataSourceImpl
import com.test.data.data_source.remote.BrandRemoteDataSourceImpl
import com.test.data.db.LocalDatabase
import com.test.domain.dataSource.BrandLocalDataSource
import com.test.domain.dataSource.BrandRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideRetrofitApi():RetrofitApi{
        return RetrofitApi()
    }

    @Provides
    @Singleton
    fun provideRemoteDataSource(retrofitApi: RetrofitApi):BrandRemoteDataSource{
        return BrandRemoteDataSourceImpl(retrofitApi)
    }

}