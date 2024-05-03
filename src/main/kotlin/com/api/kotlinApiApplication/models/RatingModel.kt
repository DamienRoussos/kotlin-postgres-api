package com.api.kotlinApiApplication.models

import jakarta.persistence.*

@Entity
@Table(name = "ratings")
data class RatingModel(

    @Id
    @Column(name = "rating_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val count: Int,
    val rating: Float,
    val ratingText: String?
)
