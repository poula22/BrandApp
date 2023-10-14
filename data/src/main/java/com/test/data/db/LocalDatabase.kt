package com.test.data.db

import com.test.data.models.local.BrandEntity


class LocalDatabase {
    fun getMobileI(): BrandEntity {
        return BrandEntity('I')
    }

    fun getMobileS(): BrandEntity {
        return BrandEntity('S')
    }
}