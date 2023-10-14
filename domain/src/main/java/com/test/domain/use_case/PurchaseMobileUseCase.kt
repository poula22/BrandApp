package com.test.domain.use_case

import com.test.domain.repo.PurchaseMobileRepo

class PurchaseMobileUseCase(val purchaseMobileRepo: PurchaseMobileRepo) {
    suspend operator  fun invoke(char: Char) = purchaseMobileRepo.getMobile(char)
}