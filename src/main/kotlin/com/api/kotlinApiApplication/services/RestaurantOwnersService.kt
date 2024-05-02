package com.api.kotlinApiApplication.services

import com.api.kotlinApiApplication.models.RestaurantOwners
import com.api.kotlinApiApplication.repositories.RestaurantOwnersRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class RestaurantOwnersService(
    private val restOwnersRepo: RestaurantOwnersRepository
) {
    fun getById(id: UUID): List<RestaurantOwners> = restOwnersRepo.findByRestaurantId(id)

}