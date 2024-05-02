package com.api.kotlinApiApplication.models

import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import java.io.Serializable
import java.util.*


@Embeddable
class RestaurantOwnersKey : Serializable {
    @Column(name = "owner_id")
    var ownerId: UUID? = null

    @Column(name = "restaurant_id")
    var restaurantId: UUID? = null
}