package com.example.sfera.domain

import com.example.sfera.domain.ShopItem
import com.example.sfera.domain.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}
