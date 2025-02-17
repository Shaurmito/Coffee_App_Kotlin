package com.example.myapplication.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.Model.ItemsModel
import com.example.myapplication.Repository.MainRepository

class MainViewModel:ViewModel() {
    private val repository=MainRepository()

    fun loadFiltered(id:Int): LiveData<MutableList<ItemsModel>>{
        return repository.loadFiltered(id)
    }
}