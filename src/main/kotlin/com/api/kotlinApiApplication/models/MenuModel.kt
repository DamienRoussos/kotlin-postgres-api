package com.api.kotlinApiApplication.models

import jakarta.persistence.*


@Entity
@Table(name = "menus")
data class MenuModel(

    @Id
    @Column(name = "menu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    val description: String?,
    val dietaryInformation: List<String>?,
    val price: Double
)
