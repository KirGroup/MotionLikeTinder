package com.example.sfera.domain

import com.example.sfera.domain.ShopItem
import com.example.sfera.domain.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}
