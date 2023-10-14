package com.test.phonebrand.di

import com.test.data.data_source.local.BrandLocalDataSourceImpl
import com.test.data.db.LocalDatabase
import com.test.domain.dataSource.BrandLocalDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {
    @Provides
    @Singleton
    fun provideLocalDatabase(): LocalDatabase {
        return LocalDatabase()
    }

    @Provides
    @Singleton
    fun provideLocalDataSource(localDatabase: LocalDatabase): BrandLocalDataSource {
        return BrandLocalDataSourceImpl(localDatabase)
    }
}