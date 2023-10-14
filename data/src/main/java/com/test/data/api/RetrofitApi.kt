package com.test.data.api

import com.test.data.models.remote.BrandDto

class RetrofitApi {
    fun getMobileI(): BrandDto {
        return BrandDto('I')
    }

    fun getMobileS(): BrandDto {
        return BrandDto('S')
    }
}