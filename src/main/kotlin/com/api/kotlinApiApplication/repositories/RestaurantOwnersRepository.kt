package com.api.kotlinApiApplication.repositories

import com.api.kotlinApiApplication.models.RestaurantOwners
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface RestaurantOwnersRepository: JpaRepository<RestaurantOwners, UUID> {

    fun findByRestaurantId(restaurantId:UUID): List<RestaurantOwners>
}