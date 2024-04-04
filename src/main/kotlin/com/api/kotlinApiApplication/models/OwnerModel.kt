package com.api.kotlinApiApplication.models

import jakarta.persistence.*
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "owners")
data class OwnerModel (

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String?,
    val name: String,
    val taxNumber: String,
    val phoneNumber: String,
    val email: String,
    val createdOn: LocalDateTime = LocalDateTime.now(),
    val updatedOn: LocalDateTime?
)