package com.example.shopping_list2.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    suspend fun editShopItem(shopItem: ShopItem)

    suspend fun addShopItem(shopItem: ShopItem)

    suspend fun deleteShopItem(shopItem: ShopItem)

    suspend fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>
}