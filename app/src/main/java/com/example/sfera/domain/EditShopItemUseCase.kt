package com.example.sfera.domain

import com.example.sfera.domain.ShopItem
import com.example.sfera.domain.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}
