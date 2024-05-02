package com.api.kotlinApiApplication.models

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
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
    @ManyToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "owner_id")
    val owners: OwnerModel,
//    val ultimateBeneficialOwner: OwnerModel,
//    val menuItems: List<MenuModel>,
//    val ratings
//    val cuisines
//    val paymentOptions
    @CreationTimestamp
    val createdOn: LocalDateTime? = LocalDateTime.now(),
    @UpdateTimestamp
    val updatedOn: LocalDateTime?,

)