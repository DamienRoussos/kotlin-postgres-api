package com.api.kotlinApiApplication.models

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "restaurants")
data class RestaurantModel(

    @Id
    @Column(name = "restaurant_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID?,
    val name: String,
    val address: String,
    val active: Boolean,
    val zipcode: String,
    val latitude: Double,
    val longitude: Double,
    val city: String,
    val country: String,
    val phoneNumber: String,
    val email: String,
    val websiteUrl: String?,
    val socialMediaProfiles: List<String>,
    @OneToOne
    @JoinColumn(name = "owner_id")
    val ultimateBeneficialOwner: OwnerModel,
    @OneToMany
    @JoinTable(
        name = "owners_of_restaurant",
        joinColumns = arrayOf(JoinColumn(name = "restaurant_id")),
        inverseJoinColumns = arrayOf(JoinColumn(name = "owner_id"))
    )
    val owners: List<OwnerModel>,
    @OneToMany
    @JoinTable(
        name = "menuItems_of_restaurant",
        joinColumns = arrayOf(JoinColumn(name = "restaurant_id")),
        inverseJoinColumns = arrayOf(JoinColumn(name = "menuItem_id"))
    )
    val menuItems: List<MenuModel>?,
    @OneToMany
    @JoinTable(
        name = "ratings_of_restaurant",
        joinColumns = arrayOf(JoinColumn(name = "restaurant_id")),
        inverseJoinColumns = arrayOf(JoinColumn(name = "rating_id"))
    )
    val ratings: List<RatingModel>?,
    @OneToMany
    @JoinTable(
        name = "cuisines_of_restaurant",
        joinColumns = arrayOf(JoinColumn(name = "restaurant_id")),
        inverseJoinColumns = arrayOf(JoinColumn(name = "cuisine_id"))
    )
    val cuisines: List<CuisineModel>?,
//    val paymentOptions
    @CreationTimestamp
    val createdOn: LocalDateTime? = LocalDateTime.now(),
    @UpdateTimestamp
    val updatedOn: LocalDateTime?,

    )