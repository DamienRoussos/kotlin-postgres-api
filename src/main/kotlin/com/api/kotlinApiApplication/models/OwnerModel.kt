package com.api.kotlinApiApplication.models

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "owners")
data class OwnerModel (

    @Id
    @Column(name = "owner_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID?,
    val firstName: String,
    val lastName: String,
    val taxNumber: String,
    val phoneNumber: String,
    val email: String,
    @CreationTimestamp
    val createdOn: LocalDateTime? = LocalDateTime.now(),
    @UpdateTimestamp
    val updatedOn: LocalDateTime?,
)