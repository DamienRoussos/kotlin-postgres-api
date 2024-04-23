package com.api.kotlinApiApplication.models

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "restaurant")
data class RestaurantModel (
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID,
    val name: String,
//    val active: Boolean,
//    @CreationTimestamp
//    val createdOn: LocalDateTime? = LocalDateTime.now(),
//    @UpdateTimestamp
//    val updatedOn: LocalDateTime?,
//    @ManyToOne
//    @Fetch(FetchMode.JOIN)
//    @JoinColumn(name = "owner_id")
//    val owners: OwnerModel
)