package com.test.phonebrand.models

import com.test.domain.models.BrandDomainModel
import com.test.phonebrand.R

fun BrandDomainModel.toBrandUi() = BrandUi(
    brandName = brandName,
    id = when (brandName){
        BrandCategory.Iphone.firstLetter -> R.string.i
        BrandCategory.Samsung.firstLetter->R.string.s
        else ->null
    }
)


enum class BrandCategory(val firstLetter:Char){
    Iphone('I'),
    Samsung('S')
}