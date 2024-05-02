package com.api.kotlinApiApplication.models

import jakarta.persistence.*


@Entity
class RestaurantOwners {
    @EmbeddedId
    var id: RestaurantOwnersKey? = null

    @ManyToOne
    @MapsId("ownerId")
    @JoinColumn(name = "owner_id")
    var owner: OwnerModel? = null

    @ManyToOne
    @MapsId("restaurantId")
    @JoinColumn(name = "restaurant_id")
    var restaurant: RestaurantModel? = null
}