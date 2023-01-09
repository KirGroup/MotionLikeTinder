package com.example.sfera.domain

import com.example.sfera.domain.ShopItem
import com.example.sfera.domain.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}
