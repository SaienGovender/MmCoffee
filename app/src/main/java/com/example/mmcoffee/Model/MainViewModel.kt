package com.example.mmcoffee.Model

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mmcoffee.Domain.BannerModel
import com.example.mmcoffee.Repository.MainRepository

class MainViewModel: ViewModel() {
    private val repository = MainRepository()

    fun loadBanner(): LiveData<MutableList<BannerModel>> {
        return repository.loadBanner()
    }
}