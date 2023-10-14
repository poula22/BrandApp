package com.test.phonebrand

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.data.db.LocalDatabase
import com.test.data.api.RetrofitApi
import com.test.data.data_source.local.BrandLocalDataSourceImpl
import com.test.data.data_source.remote.BrandRemoteDataSourceImpl
import com.test.data.repo.PurchaseMobileRepoImpl
import com.test.domain.dataSource.BrandRemoteDataSource
import com.test.domain.repo.PurchaseMobileRepo
import com.test.domain.use_case.PurchaseMobileUseCase
import com.test.phonebrand.models.BrandUi
import com.test.phonebrand.models.toBrandUi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BrandViewModel @Inject constructor(private val useCase:PurchaseMobileUseCase):ViewModel() {
    private val _stateFlow= MutableStateFlow<BrandUi>(BrandUi('S',R.string.s))
    val stateFlow:StateFlow<BrandUi>
        get() = _stateFlow

    fun getMobile(char: Char) {
        viewModelScope.launch {
            _stateFlow.value=useCase.invoke(char).toBrandUi()
        }
    }
}