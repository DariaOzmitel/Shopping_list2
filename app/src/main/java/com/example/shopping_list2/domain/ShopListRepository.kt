package com.example.shopping_list2.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun editShopItem(shopItem: ShopItem)

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int):ShopItem

    fun getShopList():LiveData<List<ShopItem>>
}