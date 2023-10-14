package com.test.domain.repo

import com.test.domain.models.BrandDomainModel

interface PurchaseMobileRepo {
    suspend fun getMobile(char: Char):BrandDomainModel
}