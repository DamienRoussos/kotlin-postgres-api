package com.api.kotlinApiApplication.controllers

import com.api.kotlinApiApplication.models.RestaurantModel
import com.api.kotlinApiApplication.services.RestaurantService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/restaurants")
class RestaurantController(private val restaurantService: RestaurantService) {

    //    Create new owner
    @PostMapping("/create")
    fun createRestaurant(@RequestBody restaurant: RestaurantModel): RestaurantModel =
        restaurantService.createRestaurant(restaurant)

    @GetMapping
    fun retrieveAll(): MutableIterable<RestaurantModel> = restaurantService.getAll()

}