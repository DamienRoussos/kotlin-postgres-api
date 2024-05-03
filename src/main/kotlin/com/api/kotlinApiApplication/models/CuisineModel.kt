package com.api.kotlinApiApplication.models

import jakarta.persistence.*

@Entity
@Table(name = "cuisines")
data class CuisineModel(

    @Id
    @Column(name = "cuisine_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val cuisineName: String
)
