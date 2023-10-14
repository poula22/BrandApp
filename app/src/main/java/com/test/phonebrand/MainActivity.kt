package com.test.phonebrand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.test.phonebrand.databinding.ActivityMainBinding
import com.test.phonebrand.models.BrandCategory
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel:BrandViewModel by lazy { ViewModelProvider(this)[BrandViewModel::class.java] }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)
        subscribeToObservers(binding)
        viewModel.getMobile(BrandCategory.Iphone.firstLetter)
    }

    private fun subscribeToObservers(binding: ActivityMainBinding) {
        lifecycleScope.launch {
            viewModel.stateFlow.collect{
                brand->
                brand.id?.let {
                    binding.txtBrand.text=getString(it)
                }
            }
        }
    }
}