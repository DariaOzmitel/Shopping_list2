package com.example.shopping_list2.di

import android.app.Application
import com.example.shopping_list2.data.database.AppDataBase
import com.example.shopping_list2.data.database.ShopListDao
import com.example.shopping_list2.data.repository.ShopListRepositoryImpl
import com.example.shopping_list2.domain.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @Binds
    @ApplicationScope
    fun bindRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {

        @Provides
        @ApplicationScope
        fun provideShopListDao(application: Application): ShopListDao {
            return AppDataBase.getInstance(application).shopListDao()
        }
    }
}