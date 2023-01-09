package com.example.sfera.domain

import androidx.lifecycle.LiveData
import com.example.sfera.domain.ShopItem
import com.example.sfera.domain.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}
