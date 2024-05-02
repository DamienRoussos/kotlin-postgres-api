package com.api.kotlinApiApplication.controllers

import com.api.kotlinApiApplication.models.RestaurantOwners
import com.api.kotlinApiApplication.services.RestaurantOwnersService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
@RequestMapping("/restaurantOwners")
class RestaurantOwnersController(
    private val restaurantOwnersService: RestaurantOwnersService
) {

    @GetMapping("/{id}")
    fun retrieveById(@PathVariable id: UUID): List<RestaurantOwners> = restaurantOwnersService.getById(id)

}