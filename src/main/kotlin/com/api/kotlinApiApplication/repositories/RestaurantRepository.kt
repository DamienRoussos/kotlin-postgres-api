package com.api.kotlinApiApplication.repositories

import com.api.kotlinApiApplication.models.RestaurantModel
import org.springframework.data.repository.CrudRepository
import java.util.*

interface RestaurantRepository: CrudRepository<RestaurantModel, UUID>