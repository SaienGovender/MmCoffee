package com.example.mmcoffee.Model

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mmcoffee.Domain.BannerModel
import com.example.mmcoffee.Domain.CategoryModel
import com.example.mmcoffee.Domain.ItemsModel
import com.example.mmcoffee.Repository.MainRepository

class MainViewModel: ViewModel() {
    private val repository = MainRepository()

    fun loadBanner(): LiveData<MutableList<BannerModel>> {
        return repository.loadBanner()
    }

    fun loadCategory(): LiveData<MutableList<CategoryModel>> {
        return repository.loadCategory()
    }

    fun loadPopular(): LiveData<MutableList<ItemsModel>> {
        return repository.loadPopular()
    }
}