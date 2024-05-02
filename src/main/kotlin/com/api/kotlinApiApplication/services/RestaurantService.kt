package com.api.kotlinApiApplication.services

import com.api.kotlinApiApplication.models.OwnerModel
import com.api.kotlinApiApplication.models.RestaurantModel
import com.api.kotlinApiApplication.repositories.OwnerRepository
import com.api.kotlinApiApplication.repositories.RestaurantRepository
import org.springframework.stereotype.Service

@Service
class RestaurantService(
    private val repository: RestaurantRepository
) {
    //    Create an owner
    fun createRestaurant(restaurant: RestaurantModel): RestaurantModel = repository.save(restaurant)

    fun getAll(): MutableIterable<RestaurantModel> = repository.findAll()
}